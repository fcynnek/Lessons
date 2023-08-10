package com.coderscampus.security.Unit20Extra.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

	// this code was obtained by hovering over the annotation @EnableWebSecurity
	@Bean
 	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests((request) -> {
			request.requestMatchers("/products")
//					.permitAll();
					.hasAnyRole("USER")
					.anyRequest()
					.permitAll();
		});
		
		
		// deprecated code below
// 		http.authorizeHttpRequests().requestMatchers("/public/**").permitAll().anyRequest()
// 				.hasRole("USER").and()
// 				// Possibly more configuration ...
// 				.formLogin() // enable form based log in
// 				// set permitAll for all URLs associated with Form Login
// 				.permitAll();
 		return http.build();
 	}
}
