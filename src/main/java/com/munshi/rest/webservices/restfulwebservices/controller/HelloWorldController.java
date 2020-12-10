package com.munshi.rest.webservices.restfulwebservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.munshi.rest.webservices.restfulwebservices.bean.HelloWordBean;

@RestController
public class HelloWorldController {
	
	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Hello Munshi";
	}
	
	@GetMapping(path = "/hello-world-bean")
	public HelloWordBean helloWorldBean() {
		return new HelloWordBean("Hellow Munshi Ji");
	}
	
	@GetMapping(path = "/hello-world-path/{name}")
	public HelloWordBean helloWorldPath(@PathVariable String name) {
		return new HelloWordBean(String.format("Hellow %s Ji ", name));
	}

}
