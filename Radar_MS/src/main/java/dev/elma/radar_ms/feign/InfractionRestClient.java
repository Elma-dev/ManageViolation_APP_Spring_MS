package dev.elma.radar_ms.feign;


import dev.elma.radar_ms.models.Infraction;
import dev.elma.radar_ms.models.NewInfracInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("INFRACTION-MS")
public interface InfractionRestClient {
    @PostMapping("/infractions/add")
    Infraction saveNewInfraction(@RequestBody  NewInfracInfo newInfracInfo);

}
