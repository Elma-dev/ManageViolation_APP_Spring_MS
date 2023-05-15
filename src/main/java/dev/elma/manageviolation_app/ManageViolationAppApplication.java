package dev.elma.manageviolation_app;

import dev.elma.manageviolation_app.entities.Infraction;
import dev.elma.manageviolation_app.entities.Owner;
import dev.elma.manageviolation_app.entities.Radar;
import dev.elma.manageviolation_app.entities.Vehicle;
import dev.elma.manageviolation_app.repositories.InfractionRepository;
import dev.elma.manageviolation_app.repositories.OwnerRepository;
import dev.elma.manageviolation_app.repositories.RadarRepository;
import dev.elma.manageviolation_app.repositories.VehicleRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.Random;
import java.util.UUID;
import java.util.stream.Stream;

@SpringBootApplication @AllArgsConstructor
public class ManageViolationAppApplication implements CommandLineRunner {
    private VehicleRepository vehicleRepository;
    private OwnerRepository ownerRepository;
    private InfractionRepository infractionRepository;
    private RadarRepository radarRepository;

    public static void main(String[] args) {
        SpringApplication.run(ManageViolationAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Stream.of("Ahmed","Mohammed","Abdeljalil").forEach(n->{
            Owner owner = Owner.builder().name(n).email(n + "@gmail.com").birthDay(new Date()).build();
            this.ownerRepository.save(owner);
        });
        //getOwner
        Owner abdeljalil = this.ownerRepository.findByName("Abdeljalil").get();

        Stream.of("Ferrari","BMW","RangeRover").forEach(c->{
            Vehicle vehicle = Vehicle.builder().owner(abdeljalil).model(2023).brand(c).fiscalPower(2.30D).registrationNumber(UUID.randomUUID().toString()).build();
            vehicleRepository.save(vehicle);
        });

        //create Radar
        Random random = new Random();
        Radar radar = Radar.builder().courdonnees(new double[]{random.nextDouble(100), random.nextDouble(59)}).vitessMax(120).build();
        radarRepository.save(radar);

        //CreateInfraction

        Vehicle v2 = vehicleRepository.findByBrand("BMW").get();

        Infraction infraction = Infraction.builder().idRadr(radar.getId()).registrationNumber(v2.getRegistrationNumber())
                .radarMaxSpeed(radar.getVitessMax()).vehicleSpeed(150).date(new Date()).amount(600D).build();
        infractionRepository.save(infraction);
        //System.out.println(v2.toString());


    }
}
