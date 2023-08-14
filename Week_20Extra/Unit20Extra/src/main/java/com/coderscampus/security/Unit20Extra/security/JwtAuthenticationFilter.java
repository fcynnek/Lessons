package com.coderscampus.security.Unit20Extra.security;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.filter.OncePerRequestFilter;

import com.coderscampus.security.Unit20Extra.service.JwtService;
import com.coderscampus.security.Unit20Extra.service.UserService;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class JwtAuthenticationFilter extends OncePerRequestFilter {

	@Autowired
	private JwtService jwtService;
	
	@Autowired
	private UserService userService;
	
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		/*
		 * Requests:
		 * Headers -> key:value pairs (Authorization -> Bearer xxx.yyy.zzz)
		 * Body -> (if JSON) key:value pairs
		 */
		
		String authHeader = request.getHeader("Authorization");
		
		if (!authHeader.isEmpty()) {
			String token = authHeader.substring(7); //Bearer + space = 7
			String subject = jwtService.getSubject(token);
			Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
			
			if (!subject.isEmpty() && authentication == null) {
				UserDetails userDetails = userService.loadUserByUsername(subject);
				
				if (jwtService.isValidToken(token, userDetails)) {
					SecurityContext securityContext = SecurityContextHolder.createEmptyContext();
					UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(userDetails, userDetails.getPassword());
					securityContext.setAuthentication(authToken);
					SecurityContextHolder.setContext(securityContext);
				} 
			}
		}
		filterChain.doFilter(request, response);
	}

	
}
