package dev.elma.eureka_discovery_ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaDiscoveryMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaDiscoveryMsApplication.class, args);
    }

}
