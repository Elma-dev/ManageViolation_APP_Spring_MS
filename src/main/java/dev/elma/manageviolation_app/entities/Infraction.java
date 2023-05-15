package dev.elma.manageviolation_app.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Persistent;

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
