package com.javatechie.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CiCdDemoAppApplication {

	@GetMapping("/welcome")
	public String welcomeMessage(){
		return "Welcome To Java Techie!!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(CiCdDemoAppApplication.class, args);
	}

}
