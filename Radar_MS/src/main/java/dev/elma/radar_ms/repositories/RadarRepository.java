package dev.elma.radar_ms.repositories;


import dev.elma.radar_ms.entities.Radar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RadarRepository extends JpaRepository<Radar,Long> {
    @Query("select r from Radar r where r.id=:id")
    Radar findRadarById(@Param("id") long id);
}
