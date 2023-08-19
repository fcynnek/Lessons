package com.coderscampus.security.Unit20Extra.service;

import java.util.Date;
import java.util.HashMap;
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

	@Value("${jwt.refreshTokenExpirationTimeInMilliseconds}")
	private Long refreshTokenExpirationTimeInMilliseconds;

	@Autowired
	private UserService userService;
	
	@Autowired
	private RefreshTokenRepository refreshTokenRepository;


//	public RefreshTokenService(UserService userService, RefreshTokenRepository refreshTokenRepository) {
//		super();
//		this.userService = userService;
//		this.refreshTokenRepository = refreshTokenRepository;
//	}

	@Autowired
	private JwtService jwtService;

	
	public RefreshToken generateRefreshToken(Integer userId) {
		
		Optional<User> userOpt = userService.findById(userId);
		RefreshToken refreshToken = null;
		
		if (userOpt.isPresent()) {
			Optional<RefreshToken> refreshTokenOpt = refreshTokenRepository.findById(userId);
			
			if (refreshTokenOpt.isPresent()) {
				refreshToken = refreshTokenOpt.get();
				refreshToken.setExpirationDate(getRefreshTokenExpInMillis());
				refreshToken.setRefreshToken(generateRandomTokenValue());
			} else {
				refreshToken = new RefreshToken(userOpt.get(), generateRandomTokenValue(), 	getRefreshTokenExpInMillis());
			}
			
			refreshToken = refreshTokenRepository.save(refreshToken);
			return refreshToken;
		}
		return null;
	}


	private String generateRandomTokenValue() {
		return UUID.randomUUID().toString();
	}


	private Date getRefreshTokenExpInMillis() {
		return new Date(System.currentTimeMillis() + refreshTokenExpirationTimeInMilliseconds);
	}


	public String createNewAccessToken (String refreshToken) {
		Optional<RefreshToken> refreshTokenOpt = refreshTokenRepository.findByRefreshToken(refreshToken);
		
		String accessToken = refreshTokenOpt.map(refreshTokenObj -> jwtService.generateToken(new HashMap<>(), refreshTokenObj.getUser()))
														.orElseThrow(() -> new IllegalArgumentException("Refresh token not found"));
//		refreshTokenOpt.ifPresent(refreshTokenObj -> {
//			String accessToken = jwtService.generateToken(new HashMap<>(), refreshTokenObj.getUser());
//		});
		
		return accessToken;
	}
}
