package dev.elma.immatriculation_ms.web;

import dev.elma.immatriculation_ms.entities.Owner;
import dev.elma.immatriculation_ms.repositories.OwnerRepository;
import dev.elma.immatriculation_ms.repositories.VehicleRepository;

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
