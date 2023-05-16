package dev.elma.immatriculation_ms.web;

import dev.elma.immatriculation_ms.entities.Owner;
import dev.elma.immatriculation_ms.entities.Vehicle;
import dev.elma.immatriculation_ms.repositories.OwnerRepository;
import dev.elma.immatriculation_ms.repositories.VehicleRepository;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class RestAPI {
    private VehicleRepository vehicleRepository;
    private OwnerRepository ownerRepository;


    @GetMapping("/owners")
    public List<Owner> getAllOwners(){
        return ownerRepository.findAll();
    }

    @GetMapping("/owners/{id}")
    public Owner getOwnerById(@PathVariable long id){
        return ownerRepository.findOwnerById(id);
    }

    @PostMapping("/owners")
    public Owner addOwner(@RequestBody Owner owner){

        return ownerRepository.save(owner);
    }

    @PutMapping("/owners/update/{id}")
    public Owner updateOwner(@PathVariable long id, @RequestBody Owner owner){
        Owner owner1 = ownerRepository.findById(id).get();
        owner1.setBirthDay(owner.getBirthDay());
        owner1.setName(owner.getName());
        owner1.setEmail(owner.getEmail());
        owner1.setVehicles(owner.getVehicles());
        return ownerRepository.save(owner1);
    }

    @DeleteMapping("/owners/delete/{id}")
    public void deleteOwner(@PathVariable long id){
        ownerRepository.deleteById(id);
    }

    @GetMapping("/vehicles")
    public List<Vehicle> getAllVehicles(){
        return vehicleRepository.findAll();
    }

    @GetMapping("/vehicles/{id}")
    public Vehicle getVehicleById(@PathVariable String id){
        return vehicleRepository.findVehicleByRegNumb(id);

    }



}
