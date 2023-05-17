package dev.elma.infractin_ms.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class NewInfracInfo {
    long idRadar;
    String regNbr;
    double vehicleSpeed;
}
