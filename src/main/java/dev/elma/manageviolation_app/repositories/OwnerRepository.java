package dev.elma.manageviolation_app.repositories;

import dev.elma.manageviolation_app.entities.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OwnerRepository extends JpaRepository<Owner,Long> {
    Optional<Owner> findByName(String string);
}
