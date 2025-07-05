package com.cicd.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class JenkinCiCdTestApplication {

	@GetMapping("/greetings/{name}")
	public String greetings(@PathVariable String name) {
		return "Hello" + name + "You have done a Great Job!!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(JenkinCiCdTestApplication.class, args);
	}

}
