package com.coderscampus.security.Unit20Extra.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.coderscampus.security.Unit20Extra.domain.User;

import io.jsonwebtoken.Claims;

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
	@DisplayName("should generate a new JWS token")
	void testGenerateToken() {
		// Arrange, Act, Assert
		
		// Arrange
		Map<String, Object> extraClaims = new HashMap<>();
		User user = new User("kenny@email.com", "abc123");
		
		// Act
		String jwt = sut.generateToken(extraClaims, user);
		
		// Assert
		System.out.println(jwt);
		assertTrue(jwt.startsWith("ey"));
	}
	
	@Test
	@DisplayName("should extract all claims")
	void testExtractAllClaims() {
		// Arrange, Act, Assert
		
		// Arrange
		Map<String, Object> extraClaims = new HashMap<>();
		User user = new User("kenny@email.com", "abc123");
		String token = sut.generateToken(extraClaims, user);
		
		// Act
		Claims allClaims = sut.extractAllClaims(token);
		
		// Assert
		System.out.println(allClaims);
		assertTrue(allClaims.size() >= 3);
	}

	@Test
	@DisplayName("should extract valid subject from claims")
	void testExtractSubjectClaim() {
		// Arrange, Act, Assert
		
		// Arrange
		Map<String, Object> extraClaims = new HashMap<>();
		User user = new User("kenny@email.com", "abc123");
		String token = sut.generateToken(extraClaims, user);
		
		// Act
		String subject = sut.getSubject(token);
		
		// Assert
		assertEquals("kenny@email.com", subject);
	}
	
	@Test
	@DisplayName("should return a valid token")
	void testValidToken() {
		// Arrange, Act, Assert
		
		// Arrange
		Map<String, Object> extraClaims = new HashMap<>();
		User user = new User("kenny@email.com", "abc123");
		String token = sut.generateToken(extraClaims, user);
		
		// Act
		Boolean isValidToken = sut.isValidToken(token, user);
		
		// Assert
		assertTrue(isValidToken);
	}
	
	@Test
	@DisplayName("should return an invalid token")
	void testInvalidToken() {
		// Arrange, Act, Assert
		
		// Arrange
		Map<String, Object> extraClaims = new HashMap<>();
		User validUser = new User("kenny@email.com", "abc123");
		User invalidUser = new User("trevor@email.com", "abc123");
		String token = sut.generateToken(extraClaims, validUser);
		
		// Act
		Boolean isValidToken = sut.isValidToken(token, invalidUser);
		
		// Assert
		assertFalse(isValidToken);
	}
}
