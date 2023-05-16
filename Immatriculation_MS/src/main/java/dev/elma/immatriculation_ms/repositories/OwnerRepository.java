package dev.elma.immatriculation_ms.repositories;

import dev.elma.immatriculation_ms.entities.Owner;
import org.hibernate.annotations.Parameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface OwnerRepository extends JpaRepository<Owner,Long> {

    @Query("select o from Owner o where (o.id = :id)")
    Owner findOwnerById(@Param("id") long id);

    Optional<Owner> findByName(String string);
}
