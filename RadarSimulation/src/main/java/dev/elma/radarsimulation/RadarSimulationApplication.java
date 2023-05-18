package dev.elma.radarsimulation;

import dev.elma.radarsimulation.dtos.NewInfracInfo;
import dev.elma.radarsimulation.dtos.Radar;
import dev.elma.radarsimulation.dtos.Vehicle;
import dev.elma.radarsimulation.services.RestTempServices;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.CommandLinePropertySource;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

@SpringBootApplication @AllArgsConstructor
public class RadarSimulationApplication implements CommandLineRunner {
    //private RestTemplate restTemplate;
    private RestTempServices restTempServices;
    public static void main(String[] args) {
        SpringApplication.run(RadarSimulationApplication.class, args);
    }





    @Override
    public void run(String... args) throws Exception {
        //getAllRadars
        Radar[] allRadars = restTempServices.getAllRadars();
        //getAllVehicles
        Vehicle[] allVehicles = restTempServices.getAllVehicles();
        //createRandomIndex
        Random random=new Random();
        //randomIndexes
        int indxRadar = random.nextInt(allRadars.length);
        int indxVehicle = random.nextInt(allVehicles.length);
        //SelecteIndexesVariable
        Radar selectedRadar=allRadars[indxRadar];
        Vehicle selectedVehicle=allVehicles[indxVehicle];
        //RandomSpeeedOfVehicle
        double vehicleSpeed=random.nextDouble(selectedRadar.getVitessMax(),selectedRadar.getVitessMax()+random.nextInt(1,100));
        //sendNewInfraction
        NewInfracInfo newInfracInfo = NewInfracInfo.builder().idRadar(selectedRadar.getId()).regNbr(selectedVehicle.getRegistrationNumber()).vehicleSpeed(vehicleSpeed).build();
        boolean results = restTempServices.senInfraction(newInfracInfo);
        System.out.println(results);

        TimerTask task=new TimerTask() {
            @Override
            public void run() {
                //getAllRadars
                Radar[] allRadars = restTempServices.getAllRadars();
                //getAllVehicles
                Vehicle[] allVehicles = restTempServices.getAllVehicles();
                //createRandomIndex
                Random random=new Random();
                //randomIndexes
                int indxRadar = random.nextInt(allRadars.length);
                int indxVehicle = random.nextInt(allVehicles.length);
                //SelecteIndexesVariable
                Radar selectedRadar=allRadars[indxRadar];
                Vehicle selectedVehicle=allVehicles[indxVehicle];
                //RandomSpeeedOfVehicle
                double vehicleSpeed=random.nextDouble(selectedRadar.getVitessMax(),selectedRadar.getVitessMax()+random.nextInt(1,100));
                //sendNewInfraction
                NewInfracInfo newInfracInfo = NewInfracInfo.builder().idRadar(selectedRadar.getId()).regNbr(selectedVehicle.getRegistrationNumber()).vehicleSpeed(vehicleSpeed).build();
                boolean results = restTempServices.senInfraction(newInfracInfo);
                System.out.println(results);

            }
        };

        Timer timer=new Timer("ticTac");
        timer.schedule(task,20000L);

    }
}
