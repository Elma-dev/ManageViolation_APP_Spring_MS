package dev.elma.manageviolation_app.web;

import dev.elma.manageviolation_app.entities.Infraction;
import dev.elma.manageviolation_app.entities.Owner;
import dev.elma.manageviolation_app.entities.Radar;
import dev.elma.manageviolation_app.entities.Vehicle;
import dev.elma.manageviolation_app.repositories.InfractionRepository;
import dev.elma.manageviolation_app.repositories.OwnerRepository;
import dev.elma.manageviolation_app.repositories.RadarRepository;
import dev.elma.manageviolation_app.repositories.VehicleRepository;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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
