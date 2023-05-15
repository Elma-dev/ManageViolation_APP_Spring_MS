package dev.elma.manageviolation_app.repositories;

import dev.elma.manageviolation_app.entities.Radar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RadarRepository extends JpaRepository<Radar,Long> {
}
