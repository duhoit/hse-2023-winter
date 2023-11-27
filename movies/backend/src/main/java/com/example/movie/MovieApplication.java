package com.example.movie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MovieApplication {

	public static void main(String[] args) {
		System.out.println("Hello, World!");
		SpringApplication.run(MovieApplication.class, args);
	}
}
