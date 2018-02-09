package com.lcassiol.SimpleBackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@SpringBootApplication
public class SimpleBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleBackendApplication.class, args);
	}

}
