package com.ds.rest.runner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.ds")
public class RestServiceRunner {
	public static void main(String[] args) {
		SpringApplication.run(RestServiceRunner.class, args);
		System.out.println("RestServiceRunner is up and running now...");
	}
}
