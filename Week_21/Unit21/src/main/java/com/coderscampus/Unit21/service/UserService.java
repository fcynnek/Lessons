package com.coderscampus.Unit21.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderscampus.Unit21.domain.User;
import com.coderscampus.Unit21.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;
	
	public User save (User user) {
		return userRepo.save(user);
	}

	public User findByUsername(String username) {
		return userRepo.findByUsername(username);
	}
}
