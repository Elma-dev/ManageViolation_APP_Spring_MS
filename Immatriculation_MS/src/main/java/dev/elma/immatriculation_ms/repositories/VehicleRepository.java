package dev.elma.immatriculation_ms.repositories;

import dev.elma.immatriculation_ms.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface VehicleRepository extends JpaRepository<Vehicle,String> {

    @Query("select v from Vehicle v where v.registrationNumber=:registNumber")
    Vehicle findVehicleByRegNumb(@Param("registNumber") String registNumber);
    Optional<Vehicle> findByBrand(String s);
}
