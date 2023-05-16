package dev.elma.immatriculation_ms.repositories;

import dev.elma.immatriculation_ms.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VehicleRepository extends JpaRepository<Vehicle,String> {
    Optional<Vehicle> findByBrand(String s);
}
