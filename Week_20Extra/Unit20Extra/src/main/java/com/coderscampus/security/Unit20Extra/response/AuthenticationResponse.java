package com.coderscampus.security.Unit20Extra.response;

public record AuthenticationResponse (
		
		String username,
		// tweaking it to accept both access and refresh tokens
		String accessToken,
		String refreshToken) {}
