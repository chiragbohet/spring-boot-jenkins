package com.jenkinsdemo.basicapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BasicAppApplication {

	@GetMapping("/")
	String index(){
		return "Hello Jenkins V5";
	}

	public static void main(String[] args) {
		SpringApplication.run(BasicAppApplication.class, args);
	}

}
