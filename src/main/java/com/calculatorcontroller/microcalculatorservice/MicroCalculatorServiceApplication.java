package com.calculatorcontroller.microcalculatorservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@EnableEurekaClient
@ComponentScan({"com.calculator.controller.**","com.calculator.config.**"})
@SpringBootApplication
public class MicroCalculatorServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroCalculatorServiceApplication.class, args);
	}

}
