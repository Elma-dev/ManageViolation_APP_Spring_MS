package dev.elma.immatriculation_ms;

import dev.elma.immatriculation_ms.entities.Owner;
import dev.elma.immatriculation_ms.entities.Vehicle;
import dev.elma.immatriculation_ms.repositories.OwnerRepository;
import dev.elma.immatriculation_ms.repositories.VehicleRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.Date;
import java.util.UUID;
import java.util.stream.Stream;

@SpringBootApplication @AllArgsConstructor
public class ImmatriculationMsApplication implements CommandLineRunner {
    private OwnerRepository ownerRepository;
    private VehicleRepository vehicleRepository;
    private RepositoryRestConfiguration repositoryRestConfiguration;
    public static void main(String[] args) {
        SpringApplication.run(ImmatriculationMsApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        repositoryRestConfiguration.exposeIdsFor(VehicleRepository.class);
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
    }
}
