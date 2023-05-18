package dev.elma.radarsimulation.services;

import dev.elma.radarsimulation.dtos.Radar;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Data
@AllArgsConstructor
@Service
public class RestTempServices {
    private RestTemplate restTemplate;

    public Radar[] getAllRadars(){
        String url="http://localhost:8888/RADAR-MS/radars";
        Radar[] radar = restTemplate.getForObject(url, Radar[].class);
        return radar;
    }



}
