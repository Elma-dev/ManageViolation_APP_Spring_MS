package dev.elma.radarsimulation.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class Radar {
    private Long id;
    private Double vitessMax;
    private double[] courdonnees;
}
