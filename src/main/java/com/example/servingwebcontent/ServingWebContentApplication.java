package com.example.servingwebcontent;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.example.repo")
@ComponentScan(basePackages = { "com.example.models","com.example.servingwebcontent" })
@EntityScan("com.example.models")
@SpringBootApplication
public class ServingWebContentApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServingWebContentApplication.class, args);
	}

}