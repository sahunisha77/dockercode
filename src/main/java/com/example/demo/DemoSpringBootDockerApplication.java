package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoSpringBootDockerApplication {

	@GetMapping("/message")
	public String getMes() {
		return "welcome docker image";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringBootDockerApplication.class, args);
	}

}


/*
 * echo "# dockercode" >> README.md git init git add README.md git commit -m
 * "first commit" git branch -M main git remote add origin
 * https://github.com/sahunisha77/dockercode.git git push -u origin main
 * 
 * 
 * 
 * 
 * git remote add origin https://github.com/sahunisha77/dockercode.git git
 * branch -M main git push -u origin main
 */