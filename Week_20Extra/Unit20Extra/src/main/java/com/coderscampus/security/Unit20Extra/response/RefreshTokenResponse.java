package com.coderscampus.security.Unit20Extra.response;

public record RefreshTokenResponse(
		String accessToken, 
		String refreshToken) {

}
