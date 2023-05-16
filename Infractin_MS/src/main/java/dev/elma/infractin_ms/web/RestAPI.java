package dev.elma.infractin_ms.web;

import dev.elma.manageviolation_app.entities.Infraction;
import dev.elma.manageviolation_app.entities.Owner;
import dev.elma.manageviolation_app.entities.Radar;
import dev.elma.manageviolation_app.entities.Vehicle;
import dev.elma.manageviolation_app.repositories.InfractionRepository;
import dev.elma.manageviolation_app.repositories.OwnerRepository;
import dev.elma.manageviolation_app.repositories.RadarRepository;
import dev.elma.manageviolation_app.repositories.VehicleRepository;
import lombok.AllArgsConstructor;

import java.util.List;

@RestController @AllArgsConstructor
public class RestAPI {
    private VehicleRepository vehicleRepository;
    private OwnerRepository ownerRepository;
    private InfractionRepository infractionRepository;
    private RadarRepository radarRepository;


    @GetMapping("/owners")
    public List<Owner> getAllOwners(){
        return ownerRepository.findAll();
    }

    @PostMapping("/owners")
    public Owner addOwner(@RequestBody Owner owner){

        return ownerRepository.save(owner);
    }

    @PutMapping("/owners/update/{id}")
    public Owner updateOwner(@PathVariable long id,@RequestBody Owner owner){
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
    @GetMapping("/radars")
    public List<Radar> getAllRadars(){
        return radarRepository.findAll();
    }

    @GetMapping("/infractions")
    public List<Infraction> getAllInfractions(){
        return infractionRepository.findAll();
    }


}
