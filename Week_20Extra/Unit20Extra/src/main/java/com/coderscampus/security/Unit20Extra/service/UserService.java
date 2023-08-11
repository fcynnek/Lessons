package com.coderscampus.security.Unit20Extra.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.coderscampus.security.Unit20Extra.domain.User;
import com.coderscampus.security.Unit20Extra.repository.UserRepository;

public class UserService implements UserDetailsService {

	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
//		User user = new User(username, passwordEncoder.encode("abc123"));
		
		User user = userRepository.findByUsername(username);
		
		if (user == null) throw new UsernameNotFoundException("Bad credentials");
		
		return user;
	}

}
