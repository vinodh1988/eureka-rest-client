package com.restapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest-api")
public class Rest {

	 @GetMapping("/hello")
	 public String message() {
		 return "Rest simple service is running";
	 }
}
