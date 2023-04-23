package com.coderscampus.Unit18.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderscampus.Unit18.domain.User;
import com.coderscampus.Unit18.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	public List<User> findAll () {
		return userRepo.findAll();
	}
	
	public User findById(Long userId) {
		Optional<User> userOpt = userRepo.findById(userId);
		// findOne or findById return optionals because if the method is called on a non-existing ID, then it returns 
		// null(?) but in this case it returns a new User object
		return userOpt.orElse(new User());
	}

	public User saveUser(User user) {
		return userRepo.save(user);	
	}

	public void delete(Long userId) {
		userRepo.deleteById(userId);
		
	}

	
}
