package dev.elma.infractin_ms.web;

import dev.elma.infractin_ms.entities.Infraction;
import dev.elma.infractin_ms.repositories.InfractionRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class RestAPI {
    private InfractionRepository infractionRepository;



    @GetMapping("/infractions")
    public List<Infraction> getAllInfractions(){
        return infractionRepository.findAll();
    }


}
