package com.coderscampus.security.Unit20Extra.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.coderscampus.security.Unit20Extra.service.UserService;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

	@Bean
	public UserDetailsService userDetailsService () {
		return new UserService();
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public AuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
		daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());
		daoAuthenticationProvider.setUserDetailsService(userDetailsService());
		return daoAuthenticationProvider;
	}
	
	// this code was obtained by hovering over the annotation @EnableWebSecurity
	@Bean
 	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests((request) -> {
			request.requestMatchers("/products")
//					.permitAll();
					.hasAnyRole("USER")
					.anyRequest()
					.permitAll();
		})
//		.userDetailsService(userDetailsService()) // no longer needed here because it is being managed by the authentication provider
		.authenticationProvider(authenticationProvider())
		// default login page:
		.formLogin(Customizer.withDefaults());
		
//		.formLogin((form) -> {
//			form.loginPage("/login").permitAll();
//		});
		
		
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
