package dev.elma.manageviolation_app.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @Builder @ToString
public class Vehicle {
    @Id
    private String registrationNumber;
    private String brand;
    private int model;
    private double fiscalPower;
    @ManyToOne
    private Owner owner;


}
