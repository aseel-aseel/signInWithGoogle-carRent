package io.javabrains;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages={"io.javabrains.springbootstarter.configurations,io.javabrains.springbootstarter.controllers,io.javabrains.springbootstarter.converters,io.javabrains.springbootstarter.DTOs,io.javabrains.springbootstarter.entities,io.javabrains.springbootstarter.repositories,io.javabrains.springbootstarter.services"})
public class SignInWithGoogleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SignInWithGoogleApplication.class, args);
	}

}
