package dev.elma.radar_ms;

import dev.elma.radar_ms.entities.Radar;
import dev.elma.radar_ms.repositories.RadarRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.Random;

@SpringBootApplication @AllArgsConstructor
public class RadarMsApplication implements CommandLineRunner {

	private RadarRepository radarRepository;
	RepositoryRestConfiguration repositoryRestConfiguration;
	public static void main(String[] args) {
		SpringApplication.run(RadarMsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repositoryRestConfiguration.exposeIdsFor(Radar.class);

		//create Radar
		Random random = new Random();
		Radar radar = Radar.builder().courdonnees(new double[]{random.nextDouble(100), random.nextDouble(59)}).vitessMax(120).build();
		radarRepository.save(radar);
	}
}
