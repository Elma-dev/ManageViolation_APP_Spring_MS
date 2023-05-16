package dev.elma.infractin_ms.repositories;

import dev.elma.infractin_ms.entities.Infraction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InfractionRepository extends JpaRepository<Infraction,Long> {
}
