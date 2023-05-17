package dev.elma.infractin_ms.web;

import dev.elma.infractin_ms.entities.Infraction;
import dev.elma.infractin_ms.feignApi.RadarsRestClient;
import dev.elma.infractin_ms.feignApi.VehiclesRestClient;
import dev.elma.infractin_ms.models.NewInfracInfo;
import dev.elma.infractin_ms.models.Radar;
import dev.elma.infractin_ms.models.Vehicle;
import dev.elma.infractin_ms.repositories.InfractionRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@AllArgsConstructor
public class RestAPI {
    private InfractionRepository infractionRepository;
    private VehiclesRestClient vehiclesRestClient;
    private RadarsRestClient radarsRestClient;



    @GetMapping("/infractions")
    public List<Infraction> getAllInfractions(){
        List<Infraction> allInfractionInfo = infractionRepository.findAll();
        allInfractionInfo.forEach(i->{
            Vehicle vehicle = vehiclesRestClient.getVehiclebyRegNumber(i.getRegistrationNumber());
            Radar radar = radarsRestClient.getRadarById(i.getIdRadr());
            i.setVehicle(vehicle);
            i.setRadar(radar);

        });
        return allInfractionInfo;
    }

    @PostMapping("/infractions/add")
    public Infraction addInfraction(@RequestBody NewInfracInfo newInfracInfo){
        Vehicle vehicle = vehiclesRestClient.getVehiclebyRegNumber(newInfracInfo.getRegNbr());
        Radar radar = radarsRestClient.getRadarById(newInfracInfo.getIdRadar());

        Infraction infraction = Infraction.builder().date(new Date()).idRadr(newInfracInfo.getIdRadar()).radar(radar)
                .registrationNumber(newInfracInfo.getRegNbr()).vehicle(vehicle).radarMaxSpeed(radar.getVitessMax())
                .vehicleSpeed(newInfracInfo.getVehicleSpeed()).amount(600).build();
        return infractionRepository.save(infraction);
    }



}
