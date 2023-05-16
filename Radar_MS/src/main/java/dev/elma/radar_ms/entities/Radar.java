package dev.elma.radar_ms.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Radar {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private double vitessMax;
    private double[] courdonnees;
}
