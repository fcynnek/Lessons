package com.coderscampus.security.Unit20Extra.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.coderscampus.security.Unit20Extra.domain.User;

@TestInstance(Lifecycle.PER_CLASS)
//@SpringBootTest
class JwtServiceTest {

//	@Autowired
	private static JwtService sut;
	
	@BeforeAll
	static void init() {
		sut = new JwtService();
		sut.setExpirationTimeInMilliseconds(300000L);
		sut.setJwtSigningKey("E22161AC9B7B5F841FBF4D9FFC43DBE0F9D317DAB4174AD40FFBF73706820E81");
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
