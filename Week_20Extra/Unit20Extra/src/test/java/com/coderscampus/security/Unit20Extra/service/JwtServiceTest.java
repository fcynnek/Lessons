package com.coderscampus.security.Unit20Extra.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.coderscampus.security.Unit20Extra.domain.User;

class JwtServiceTest {

	private static JwtService sut;
	
	@BeforeAll
	static void init() {
		sut = new JwtService();
	}
	
	@Test
	void testGenerateToken() {
		// Arrange, Act, Assert
		
		// Arrange
		Map<String, Object> extraClaims = new HashMap<>();
		User user = new User("kenny@email.com", "abc123");
		
		// Act
		String jwt = sut.generateToken(extraClaims, user);
		
		// Assert
		System.out.println(jwt);
	}

}
