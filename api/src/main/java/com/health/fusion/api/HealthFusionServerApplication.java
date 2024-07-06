package com.health.fusion.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.health.fusion"})
@EntityScan(basePackages = {"com.health.fusion"})
@EnableJpaRepositories(basePackages = {"com.health.fusion"})
@EnableJpaAuditing
public class HealthFusionServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthFusionServerApplication.class, args);
	}

}
