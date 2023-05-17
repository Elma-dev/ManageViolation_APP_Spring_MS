package dev.elma.radar_ms.web;


import dev.elma.radar_ms.entities.Radar;
import dev.elma.radar_ms.repositories.RadarRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class RestAPI {
    private RadarRepository radarRepository;

    @GetMapping("/radars")
    public List<Radar> getAllRadars(){
        return radarRepository.findAll();
    }
    @GetMapping("/radars/{id}")
    public Radar findRadarById(@PathVariable long id){
        return  radarRepository.findRadarById(id);
    };



}
