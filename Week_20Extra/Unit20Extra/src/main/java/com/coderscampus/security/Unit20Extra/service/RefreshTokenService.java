package com.coderscampus.security.Unit20Extra.service;

import java.util.Date;
import java.util.HashMap;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.coderscampus.security.Unit20Extra.domain.RefreshToken;
import com.coderscampus.security.Unit20Extra.domain.User;
import com.coderscampus.security.Unit20Extra.repository.RefreshTokenRepository;
import com.coderscampus.security.Unit20Extra.request.RefreshTokenRequest;

@Service
public class RefreshTokenService {

	@Value("${jwt.refreshTokenExpirationTimeInMilliseconds}")
	private Long refreshTokenExpirationTimeInMilliseconds;

//	@Autowired
	private UserService userService;
	
//	@Autowired
	private RefreshTokenRepository refreshTokenRepository;

//	@Autowired
	private JwtService jwtService;

	
	
	public RefreshTokenService(UserService userService, RefreshTokenRepository refreshTokenRepository,
			JwtService jwtService) {
		super();
		this.userService = userService;
		this.refreshTokenRepository = refreshTokenRepository;
		this.jwtService = jwtService;
	}


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


	public String createNewAccessToken (@RequestBody RefreshTokenRequest refreshTokenRequest) {
		Optional<RefreshToken> refreshTokenOpt = refreshTokenRepository.findByRefreshToken(refreshTokenRequest.refreshToken());
		
		String accessToken = refreshTokenOpt.map(refreshToken -> jwtService.generateToken(new HashMap<>(), refreshToken.getUser()))
														.orElseThrow(() -> new IllegalArgumentException("Refresh token not found"));
//		refreshTokenOpt.ifPresent(refreshTokenObj -> {
//			String accessToken = jwtService.generateToken(new HashMap<>(), refreshTokenObj.getUser());
//		});
		
		return accessToken;
	}
}
