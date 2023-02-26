package com.coderscampus.Unit13.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.coderscampus.Unit13.domain.User;

@Configuration
//public class Week13Configuration {
// alternatively to having application.properties files (src/main/resources), we can leverage this and make multiple profiles
@Profile("dev")
public class Week13DevConfiguration {

//	@Bean
//	public Datasource datasource() {
//		Datasource db = new Datasource();
//		db.setConnectionString("http://www.hiasfbasjhf.com:3360");
//		db.setUsername("dev01dbetc");
//		
//		return db;
//	}
	
	// the 2 below beans will fail the boot of Spring because it is expecting only 1 bean and in this case there are 2
	// NOTE: this is not a common practice to pass in user data. User data is ALWAYS stored in the db
	// For continuation of fixing this issue, go to FileController for @qualifier annotation
	@Bean
	public User superUser() {
		return new User("Kenny@email.com", "asfbhjkasbfkj", "Kenny Cheng");
	}
	
	@Bean
	public User regularUser() {
		return new User("joe@email.com", "joe123", "John Doe");
	}
}
