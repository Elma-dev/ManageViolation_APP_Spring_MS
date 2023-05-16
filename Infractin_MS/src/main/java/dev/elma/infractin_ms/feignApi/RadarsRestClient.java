package dev.elma.infractin_ms.feignApi;

import dev.elma.infractin_ms.models.Radar;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "RADAR-MS")
public interface RadarsRestClient {
    @GetMapping(path = "/radars")
    List<Radar> getAllRadars();
    @GetMapping(path="/radars/{id}")
    Radar getRadarById(@PathVariable long id);
}
