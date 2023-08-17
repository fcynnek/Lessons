package com.coderscampus.security.Unit20Extra.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.util.matcher.AnyRequestMatcher;

import com.coderscampus.security.Unit20Extra.repository.UserRepository;
import com.coderscampus.security.Unit20Extra.service.UserService;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

	@Autowired
	private UserRepository userRepository;
	
//	@Autowired
	private JwtAuthenticationFilter jwtAuthenticationFilter;
	
	
	public SecurityConfiguration(UserRepository userRepository, JwtAuthenticationFilter jwtAuthenticationFilter) {
	super();
	this.userRepository = userRepository;
	this.jwtAuthenticationFilter = jwtAuthenticationFilter;
}

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

		http.csrf(AbstractHttpConfigurer::disable)
			.authorizeHttpRequests((request) -> {
			request
//					.permitAll();
//					.hasAnyRole("USER")
//					.anyRequest()
//					.permitAll();
					.requestMatchers("/api/v1/users").permitAll()
					.requestMatchers("/products").authenticated();
					// this is also an option which basically means "anything else"
//					.AnyRequestMatcher().authenticated();
		})
		.sessionManagement(manager -> manager.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
//		.userDetailsService(userDetailsService()) // no longer needed here because it is being managed by the authentication provider
		.authenticationProvider(authenticationProvider())
		.addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);
		// default login page:
		// we are getting rid of the login page b/c we want to be able to hand off the auth using cookies stored in the session
//		.formLogin(Customizer.withDefaults());
		
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
