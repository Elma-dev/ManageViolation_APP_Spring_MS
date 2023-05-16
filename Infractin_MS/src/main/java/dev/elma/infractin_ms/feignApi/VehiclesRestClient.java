package dev.elma.infractin_ms.feignApi;

import dev.elma.infractin_ms.models.Vehicle;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "IMMATRICULATION-MS")
public interface VehiclesRestClient {
    @GetMapping(path = "/vehicles")
    List<Vehicle> getAllVehicles();
    @GetMapping(path = "/vehicles/{id}")
    Vehicle getVehiclebyRegNumber(@PathVariable String id);
}
