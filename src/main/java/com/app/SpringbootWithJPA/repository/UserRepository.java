package com.app.SpringbootWithJPA.repository;

import org.springframework.data.repository.CrudRepository;

import com.app.SpringbootWithJPA.entity.User;

public interface UserRepository  extends CrudRepository<User, Integer>{

}
