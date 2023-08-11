package com.coderscampus.security.Unit20Extra.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.security.Unit20Extra.domain.User;
import com.coderscampus.security.Unit20Extra.repository.UserRepository;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
//	@PostMapping("/users")
	@PostMapping("")
	public ResponseEntity<User> signUpUser (@RequestBody User user) {
		
		User newUser = new User(user.getUsername(), passwordEncoder.encode(user.getPassword()));
		User savedUser =  userRepository.save(user);
		
		return ResponseEntity.ok(savedUser);
	}
}
