package dev.elma.radar_ms.models;

import jakarta.persistence.Transient;

import java.util.Date;

public class Infraction {
    private long id;
    private Date date;
    private long idRadr;
    private String registrationNumber;
    private Radar radar;
    private Vehicle vehicle;
    private double radarMaxSpeed;
    private double vehicleSpeed;
    private double amount;

}
