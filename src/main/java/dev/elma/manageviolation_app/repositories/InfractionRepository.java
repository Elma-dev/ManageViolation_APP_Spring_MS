package dev.elma.manageviolation_app.repositories;

import dev.elma.manageviolation_app.entities.Infraction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InfractionRepository extends JpaRepository<Infraction,Long> {
}
