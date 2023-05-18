package dev.elma.radar_ms;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.google.protobuf.Message;
import dev.elma.radar_ms.entities.Radar;
import dev.elma.radar_ms.repositories.RadarRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.http.converter.protobuf.ProtobufHttpMessageConverter;
import org.springframework.http.converter.protobuf.ProtobufJsonFormatHttpMessageConverter;

import java.io.IOException;
import java.util.Random;

@SpringBootApplication @AllArgsConstructor @EnableFeignClients
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
		Radar radar = Radar.builder().courdonnees(new double[]{random.nextDouble(100),
				random.nextDouble(59)}).vitessMax(120).build();
		radarRepository.save(radar);
	}




}
