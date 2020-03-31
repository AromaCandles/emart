package com.ARC.webApp.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageAPIController {
	
	@CrossOrigin
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String helloWorld() {
		System.out.println("Hello World!!!");
		return "Hello World!!!";
	}

}
