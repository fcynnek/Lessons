package com.coderscampus.Unit20.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.coderscampus.Unit20.domain.User;
import com.coderscampus.Unit20.repository.UserRepository;
import com.coderscampus.Unit20.security.CustomSecurityUser;

@Service
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = userRepository.findByUsername(username);
		
		if (user == null) {
			throw new UsernameNotFoundException("Username and/or password was incorrect.");
			/*
			 *  return user had a compile error. One way to fix it is to implement UserDetails to User domain. 
			 *  The downside is that it adds the unimplemented methods and though it is ok with the objects domains. Which makes it difficult to switch security services if needed.
			 *  Instead Trevor creates a new class under Security Package and extends the objects AND implements UserDetails
			 */
		}
		return new CustomSecurityUser(user);
		
	}

	
}
