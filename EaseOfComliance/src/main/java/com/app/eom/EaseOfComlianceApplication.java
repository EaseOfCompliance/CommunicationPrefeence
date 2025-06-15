package com.app.eom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
@SpringBootApplication(scanBasePackages = "com.app.eom.controller")
public class EaseOfComlianceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EaseOfComlianceApplication.class, args);
	}

}
