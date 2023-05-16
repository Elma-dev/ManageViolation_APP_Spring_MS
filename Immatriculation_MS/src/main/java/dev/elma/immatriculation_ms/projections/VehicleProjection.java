package dev.elma.immatriculation_ms.projections;

import dev.elma.immatriculation_ms.entities.Owner;
import dev.elma.immatriculation_ms.entities.Vehicle;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "fullVehicle",types = Vehicle.class)
public interface VehicleProjection {

     String getRegistrationNumber();
     String getBrand();
     int getModel();
     double getFiscalPower();

     Owner getOwner();
}
