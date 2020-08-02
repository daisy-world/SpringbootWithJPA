package com.app.SpringbootWithJPA.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.SpringbootWithJPA.entity.User;
import com.app.SpringbootWithJPA.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	
	public User saveUser() {
		
		User user = new User();
		
		user.setId(2);
		user.setUser_name("Bipsa");
		user.setAddress("Bglore");
		return userRepository.save(user);
		
		
	}
	
	
	public Optional<User> getUserById(int id) {
		
		return  userRepository.findById(id);
		
	

	}
	
	public List<User> getUserList(){
		
		return (List<User>) userRepository.findAll();
	}

}
