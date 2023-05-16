package dev.elma.infractin_ms.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Infraction {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date date;
    private long idRadr;
    private String registrationNumber;
    @Transient
    private Radar radar;
    @Transient
    private Vehicle vehicle;
    private double radarMaxSpeed;
    private double vehicleSpeed;
    private double amount;

}
