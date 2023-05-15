package dev.elma.manageviolation_app.repositories;

import dev.elma.manageviolation_app.entities.Owner;
import dev.elma.manageviolation_app.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface VehicleRepository extends JpaRepository<Vehicle,String> {
    Optional<Vehicle> findByBrand(String s);
}
