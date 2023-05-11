package com.coderscampus.Unit20.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Bean
	public PasswordEncoder passwordEncoder () {
		return new BCryptPasswordEncoder();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		// TODO Auto-generated method stub
//		super.configure(auth);
		
		auth.inMemoryAuthentication()
			.withUser("kenny@email.com")
			.password("password123")
			.roles("USER", "ADMIN");
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
//		// TODO Auto-generated method stub
//		super.configure(http);
		
		http.csrf().disable()
			.authorizeRequests().antMatchers("/admin/**").hasAnyRole("ADMIN")
			.anyRequest().hasAnyRole("USER").and()
			.formLogin()
			.loginPage("/login")
			// trick: hover over the loginPage() method and expand the info window and it provides what a login page should have
			.defaultSuccessUrl("/dashboard")
			.permitAll();
	}
	
}
