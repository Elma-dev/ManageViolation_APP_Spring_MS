package dev.elma.radar_ms.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class NewInfracInfo {
    long idRadar;
    String regNbr;
    double vehicleSpeed;
}
