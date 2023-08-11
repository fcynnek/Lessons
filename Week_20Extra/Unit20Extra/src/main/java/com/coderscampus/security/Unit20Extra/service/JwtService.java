package com.coderscampus.security.Unit20Extra.service;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service
public class JwtService {

	/*
	 * 1. Create a JWT signing key
	 * 1.1. Create / Generate the JWT
	 * 2. Extract claims (ie. get stuff from the payload)
	 * 3. Verify that it is valid
	 * 4. Sign the JWT
	 */
	
	@Value("${jwt.signingKey}")
	private String jwtSigningKey;
	/*
	 *  check application.properties file for JWT signing key
	 *  https://stackoverflow.com/questions/31309759/what-is-secret-key-for-jwt-based-authentication-and-how-to-generate-it
	 *  https://www.grc.com/passwords.htm
	 */
	
	private Long expirationTimeInMilliseconds;
	
	public String generateToken(Map<String, Object> extraClaims, UserDetails user) {
		Jwts.builder()
			.setClaims(extraClaims)
			.setSubject(user.getUsername())
			.setIssuedAt(new Date())
			.setExpiration(null)
			.signWith(null, SignatureAlgorithm.HS256);
		return null;
	}
}
