package com.coderscampus.Unit13.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.coderscampus.Unit13.domain.User;

@Configuration
public class Week13Configuration {

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
		return new User("KennyC", "asfbhjkasbfkj", "Kenny Cheng");
	}
}
