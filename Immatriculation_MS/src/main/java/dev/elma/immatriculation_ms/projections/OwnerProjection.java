package dev.elma.immatriculation_ms.projections;

import dev.elma.immatriculation_ms.entities.Owner;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name = "fullOwner",types = Owner.class)
public interface OwnerProjection {
     long getId();
     String getName();
     Date getBirthDay();
     String getEmail();
}
