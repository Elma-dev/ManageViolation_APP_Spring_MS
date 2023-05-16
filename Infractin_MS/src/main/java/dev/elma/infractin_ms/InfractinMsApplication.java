package dev.elma.infractin_ms;

import dev.elma.infractin_ms.feignApi.RadarsRestClient;
import dev.elma.infractin_ms.feignApi.VehiclesRestClient;
import dev.elma.infractin_ms.models.Radar;
import dev.elma.infractin_ms.models.Vehicle;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.util.List;

@SpringBootApplication
@EnableFeignClients @AllArgsConstructor
public class InfractinMsApplication implements CommandLineRunner {
	RadarsRestClient radarsRestClient;
	VehiclesRestClient vehiclesRestClient;

	public static void main(String[] args) {
		SpringApplication.run(InfractinMsApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

		List<Vehicle> allVehicle=vehiclesRestClient.getAllVehicles();
		List<Radar> allRadars = radarsRestClient.getAllRadars();


		allVehicle.forEach(v->{
			System.out.println(v);
		});

		allRadars.forEach(r->{
			System.out.println(r);
		});



	}
}
