package com.calculator.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(path="/calculate")
public class CalculatorController {

	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping(path="/ADD/{inputOne}/{inputTwo}")
	public String getAddResponse(@PathVariable("inputOne") BigDecimal inputOne,@PathVariable("inputTwo") BigDecimal inputTwo) {
		System.out.println("CalculatorController :: getAddResponse, inputOne= "+inputOne+" , inputTwo= "+inputTwo);
		
		//NORMAL URL :
		//String url="http://localhost:12345/micro-add-service/add/do/"+inputOne+"/"+inputTwo;
		
		//EUREKA SERVER URL: SERVICE DISCOVERY
		String url="http://micro-add-service/micro-add-service-context/add/do/"+inputOne+"/"+inputTwo;
		
		System.out.println("The URL = "+url);
		String addResult=restTemplate.getForObject(url, String.class);
		System.out.println("Result = "+addResult);
		return addResult;
	}
}
