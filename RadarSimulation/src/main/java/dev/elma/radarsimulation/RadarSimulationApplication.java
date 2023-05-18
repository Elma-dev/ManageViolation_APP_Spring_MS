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

        NewInfracInfo newInfracInfo = NewInfracInfo.builder().idRadar(1).regNbr("2340a555-c142-427d-ac8a-c132a909c2ac").vehicleSpeed(300).build();
        boolean results = restTempServices.senInfraction(newInfracInfo);
        System.out.println(results);

    }
}
