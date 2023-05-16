package dev.elma.radar_ms.repositories;


import dev.elma.radar_ms.entities.Radar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RadarRepository extends JpaRepository<Radar,Long> {
}
