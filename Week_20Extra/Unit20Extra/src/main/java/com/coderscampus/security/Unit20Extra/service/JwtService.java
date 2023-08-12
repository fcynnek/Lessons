package com.coderscampus.security.Unit20Extra.service;

import java.security.Key;
import java.util.Date;
import java.util.Map;

import javax.crypto.SecretKey;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Header;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

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
	
	@Value("${jwt.expirationTimeInMilliseconds}")
	// this is a constant time value that we will set on our application.properties file
	private Long expirationTimeInMilliseconds;
	
	// we are creating setters in the main code because that way we can gun JUnit Tests w/o integrating Sprint Testing 
	public void setJwtSigningKey(String jwtSigningKey) {
		if (this.jwtSigningKey == null) {
			this.jwtSigningKey = jwtSigningKey;			
		}
	}

	public void setExpirationTimeInMilliseconds(Long expirationTimeInMilliseconds) {
		if (this.expirationTimeInMilliseconds == null) {
			this.expirationTimeInMilliseconds = expirationTimeInMilliseconds;			
		}
	}

	public String generateToken(Map<String, Object> extraClaims, UserDetails user) {
		Jwts.builder()
			.setClaims(extraClaims)
			.setSubject(user.getUsername())
			.setIssuedAt(new Date())
			.setExpiration(new Date(System.currentTimeMillis() + expirationTimeInMilliseconds))
			.setHeaderParam("typ", Header.JWT_TYPE)
			.signWith(getSigningKey(), SignatureAlgorithm.HS256)
			.compact();
		return null;
	}

	private Key getSigningKey() {
		byte[] jwtSigningKeyAsBytes = Decoders.BASE64.decode(jwtSigningKey);
		SecretKey secretKey = Keys.hmacShaKeyFor(jwtSigningKeyAsBytes);
		return secretKey;
	}
	
	public Claims extractAllClaims(String jwt) {
		Claims body = Jwts.parserBuilder()
						.setSigningKey(getSigningKey())
						.build()
						.parseClaimsJws(jwt)
						.getBody();
		return body;
	}
}
