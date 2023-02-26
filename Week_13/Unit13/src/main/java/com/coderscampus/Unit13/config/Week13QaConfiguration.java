package com.coderscampus.Unit13.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.coderscampus.Unit13.domain.User;

@Configuration
//public class Week13Configuration {
// alternatively to having application.properties files (src/main/resources), we can leverage this and make multiple profiles
@Profile("qa")
public class Week13QaConfiguration {

//	@Bean
//	public Datasource datasource() {
//		Datasource db = new Datasource();
//		db.setConnectionString("http://www.hiasfbasjhf.com:3360");
//		db.setUsername("dev01dbetc");
//		
//		return db;
//	}
	
	@Bean
	public User user() {
		return new User("JohnD", "asfbhjkasbfkj", "John Doe");
	}
}
