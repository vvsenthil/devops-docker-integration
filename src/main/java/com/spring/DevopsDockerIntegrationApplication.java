package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsDockerIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevopsDockerIntegrationApplication.class, args);
	}

	public String message() {
		return "Welcome Senthil!";
	}
}
