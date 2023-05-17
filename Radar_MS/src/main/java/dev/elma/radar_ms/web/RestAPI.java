package dev.elma.radar_ms.web;


import dev.elma.radar_ms.entities.Radar;
import dev.elma.radar_ms.feign.InfractionRestClient;
import dev.elma.radar_ms.models.Infraction;
import dev.elma.radar_ms.models.NewInfracInfo;
import dev.elma.radar_ms.repositories.RadarRepository;
import lombok.AllArgsConstructor;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class RestAPI {
    private RadarRepository radarRepository;
    private InfractionRestClient infractionRestClient;

    @GetMapping("/radars")
    public List<Radar> getAllRadars(){
        return radarRepository.findAll();
    }
    @GetMapping("/radars/{id}")
    public Radar findRadarById(@PathVariable long id){
        return  radarRepository.findRadarById(id);
    };
    @PostMapping("/newInfraction")
    public boolean saveInfractionFromRadar(@RequestBody NewInfracInfo newInfracInfo){

        infractionRestClient.saveNewInfraction(newInfracInfo);
        return true;

    }



}
