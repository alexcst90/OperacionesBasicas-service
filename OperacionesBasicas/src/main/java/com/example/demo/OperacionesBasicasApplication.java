package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@RestController

@EnableCircuitBreaker
@SpringBootApplication
public class OperacionesBasicasApplication {

	public static void main(String[] args) {
		SpringApplication.run(OperacionesBasicasApplication.class, args);
	}
}
