package dev.elma.immatriculation_ms.repositories;

import dev.elma.immatriculation_ms.entities.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OwnerRepository extends JpaRepository<Owner,Long> {
    Optional<Owner> findByName(String string);
}
