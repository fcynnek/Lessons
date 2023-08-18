package com.coderscampus.security.Unit20Extra.service;

import java.util.Date;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.coderscampus.security.Unit20Extra.domain.RefreshToken;
import com.coderscampus.security.Unit20Extra.domain.User;
import com.coderscampus.security.Unit20Extra.repository.RefreshTokenRepository;

@Service
public class RefreshTokenService {

	@Autowired
	private UserService userService;
	
	@Value("${jwt.refreshTokenExpirationTimeInMilliseconds}")
	private Long refreshTokenExpirationTimeInMilliseconds;
	
	@Autowired
	private RefreshTokenRepository refreshTokenRepository;
	
	public RefreshToken generateRefreshToken(Integer userId) {
		
		Optional<User> userOpt = userService.findById(userId);
		
		if (userOpt.isPresent()) {
			RefreshToken refreshToken = new RefreshToken(userOpt.get(), UUID.randomUUID().toString(), 
					new Date(System.currentTimeMillis() + refreshTokenExpirationTimeInMilliseconds));
			refreshToken = refreshTokenRepository.save(refreshToken);
			return refreshToken;
		}
		return null;
	}
}
