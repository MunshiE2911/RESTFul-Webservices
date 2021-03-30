package com.munshi.rest.webservices.restfulwebservices.user.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.munshi.rest.webservices.restfulwebservices.user.bean.User;
import com.munshi.rest.webservices.restfulwebservices.user.dao.UserDAOService;
import com.munshi.rest.webservices.restfulwebservices.user.exceptions.UserNotFoundException;

@RestController
public class UserController {

	@Autowired
	private UserDAOService service;
	
	@GetMapping("/v2/users")
	public List<User> retreiveAll_v2(){
		return service.findAll();
	}
	
	@GetMapping("/users")
	public List<User> retreiveAll(){
		return service.findAll();
	}
	
	@GetMapping("/users/{id}")
	public User getUser(@PathVariable int id){
		
		User user = service.findOne(id);
		if(user == null) {
			throw new UserNotFoundException("id- "+ id);
		}
		
		return service.findOne(id);
	}
	
	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable int id){
		
		User user = service.deleteById(id);
		if(user == null) {
			throw new UserNotFoundException("id- "+ id);
		}
	}
	
	@PostMapping("/users")
	public ResponseEntity<Object> createUser(@Valid @RequestBody User user){
		User newUser =  service.save(user);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
		.buildAndExpand(newUser.getId())
		.toUri();
		
		return ResponseEntity.created(location).build();
	}
}
