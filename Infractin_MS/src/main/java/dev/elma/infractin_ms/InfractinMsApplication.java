package dev.elma.infractin_ms;

import dev.elma.infractin_ms.entities.Infraction;
import dev.elma.infractin_ms.feignApi.RadarsRestClient;
import dev.elma.infractin_ms.feignApi.VehiclesRestClient;
import dev.elma.infractin_ms.models.Radar;
import dev.elma.infractin_ms.models.Vehicle;
import dev.elma.infractin_ms.repositories.InfractionRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.util.Date;
import java.util.List;

@SpringBootApplication
@EnableFeignClients @AllArgsConstructor
public class InfractinMsApplication implements CommandLineRunner {
	RadarsRestClient radarsRestClient;
	VehiclesRestClient vehiclesRestClient;
	InfractionRepository infractionRepository;

	public static void main(String[] args) {
		SpringApplication.run(InfractinMsApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

		List<Vehicle> allVehicle=vehiclesRestClient.getAllVehicles();
		List<Radar> allRadars = radarsRestClient.getAllRadars();


		Vehicle vehicleX = vehiclesRestClient.getVehiclebyRegNumber("bb18b9be-cf58-4cf0-a07c-e9f81a9c9f9c");
		Radar radar = radarsRestClient.getRadarById(1);



		Infraction infraction = Infraction.builder().idRadr(1).registrationNumber(vehicleX.getRegistrationNumber())
				.radarMaxSpeed(radar.getVitessMax()).vehicleSpeed(150).date(new Date()).amount(600D).vehicle(vehicleX).radar(radar).build();
		infractionRepository.save(infraction);

		//System.out.println(infraction);




	}
}
