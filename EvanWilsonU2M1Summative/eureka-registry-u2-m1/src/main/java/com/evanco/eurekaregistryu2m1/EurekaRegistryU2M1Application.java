package com.evanco.eurekaregistryu2m1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaRegistryU2M1Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaRegistryU2M1Application.class, args);
	}

}
