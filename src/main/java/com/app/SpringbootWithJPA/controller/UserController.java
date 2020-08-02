package com.app.SpringbootWithJPA.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.SpringbootWithJPA.entity.User;
import com.app.SpringbootWithJPA.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	
	
	@GetMapping("/saveUser")
	
	public User saveUser() {
		System.out.println("inside save user method.......");
		
		return userService.saveUser();
		
		
	}
	
@GetMapping("/fetchUser/{id}")
	
	public Optional<User> fetchUser(@PathVariable int id) {
		System.out.println("inside save user method.......");
		
		return userService.getUserById(id);
		
		
	}

@GetMapping("/allUser")

public List<User> allUser() {
	System.out.println("inside fetch all users method.......");
	
	return userService.getUserList();
	
	
}
	
	
	/*@GetMapping("/fetchUser")
	
	public List<User> fetchUser() {
		System.out.println("inside fetch user method.......");
		
		return userService.saveUser();
		
		
	}*/
	

}
