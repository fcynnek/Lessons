package com.coderscampus.security.Unit20Extra.service;

import java.util.Date;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.coderscampus.security.Unit20Extra.domain.RefreshToken;
import com.coderscampus.security.Unit20Extra.domain.User;

@Service
public class RefreshTokenService {

	@Autowired
	private UserService userService;
	
	@Value("${jwt.refreshTokenExpirationTimeInMilliseconds}")
	private Long refreshTokenExpirationTimeInMilliseconds;
	
	public RefreshToken generateRefreshToken(Integer userId) {
		
		Optional<User> userOpt = userService.findById(userId);
		
		if (userOpt.isPresent()) {
			return new RefreshToken(null, userOpt.get(), UUID.randomUUID().toString(), new Date(System.currentTimeMillis() + refreshTokenExpirationTimeInMilliseconds));
		}
		return null;
	}
}
