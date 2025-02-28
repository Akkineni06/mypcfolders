package com.qa.lbg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class LbgSpring1Application {

	public static void main(String[] args) {
		SpringApplication.run(LbgSpring1Application.class, args);
	}

	@GetMapping("/hello")
	public String greeting() {
		return "Hello, World!";
	}

}