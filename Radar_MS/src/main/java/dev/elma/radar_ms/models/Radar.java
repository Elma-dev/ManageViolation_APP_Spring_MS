package dev.elma.radar_ms.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Radar {
    private long id;
    private double vitessMax;
    private double[] courdonnees;
}
