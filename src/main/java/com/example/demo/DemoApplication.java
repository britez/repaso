package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		sum(1,2);
	}

	public static void sum(Integer a, Integer b) {
		System.out.println("Resultado: " + (a + b));
	}

}
