package dev.elma.radar_ms.web;

import dev.elma.manageviolation_app.entities.Owner;
import dev.elma.manageviolation_app.repositories.InfractionRepository;
import dev.elma.manageviolation_app.repositories.OwnerRepository;
import dev.elma.manageviolation_app.repositories.RadarRepository;
import dev.elma.manageviolation_app.repositories.VehicleRepository;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
@Controller
@AllArgsConstructor
public class GraphQlAPI {

    private VehicleRepository vehicleRepository;
    private OwnerRepository ownerRepository;
    private InfractionRepository infractionRepository;
    private RadarRepository radarRepository;


    @QueryMapping
    public List<Owner> getAllOwners(){
        return ownerRepository.findAll();
    }

   @MutationMapping
   public Boolean deleteOwner(@Argument long id){
        ownerRepository.deleteById(id);
        return true;
   }

}
