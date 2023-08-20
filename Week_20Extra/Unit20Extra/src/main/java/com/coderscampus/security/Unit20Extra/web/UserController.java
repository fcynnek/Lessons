package com.coderscampus.security.Unit20Extra.web;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.security.Unit20Extra.domain.RefreshToken;
import com.coderscampus.security.Unit20Extra.domain.User;
import com.coderscampus.security.Unit20Extra.repository.UserRepository;
import com.coderscampus.security.Unit20Extra.response.AuthenticationResponse;
import com.coderscampus.security.Unit20Extra.service.JwtService;
import com.coderscampus.security.Unit20Extra.service.RefreshTokenService;
import com.coderscampus.security.Unit20Extra.service.UserService;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private JwtService jwtService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private RefreshTokenService refreshTokenService;
	
//	@PostMapping("/users")
	@PostMapping("")
	public ResponseEntity<AuthenticationResponse> signUpUser (@RequestBody User user) {
		
//		User newUser = new User(user.getUsername(), passwordEncoder.encode(user.getPassword()));
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		User savedUser =  userRepository.save(user);
		String accessToken = jwtService.generateToken(new HashMap<>(), savedUser);
		RefreshToken refreshToken = refreshTokenService.generateRefreshToken(savedUser.getId());
		
		return ResponseEntity.ok(new AuthenticationResponse(savedUser.getUsername(), accessToken, refreshToken.getRefreshToken()));
	}
	
	@PostMapping("/login")
	public ResponseEntity<AuthenticationResponse> signInUser (@RequestBody User user) {
		User loggedInUser = (User) userService.loadUserByUsername(user.getUsername());
		String accessToken = jwtService.generateToken(new HashMap<>(), loggedInUser);
		RefreshToken refreshToken = refreshTokenService.generateRefreshToken(loggedInUser.getId());
		
		return ResponseEntity.ok(new AuthenticationResponse(loggedInUser.getUsername(), accessToken, refreshToken.getRefreshToken()));
	}
	
	@PostMapping("/refreshtoken")
	public ResponseEntity<?> getNewAccessToken (String refreshToken) {
		String accessToken = refreshTokenService.createNewAccessToken(refreshToken);
		
		return ResponseEntity.ok(accessToken);
	}
}
