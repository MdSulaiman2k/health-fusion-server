package com.health.fusion.flyway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.health.fusion.api"})
public class HealthFusionFlyway {

	public static void main(String[] args) {
		SpringApplication.run(HealthFusionFlyway.class, args);
	}

}
