package com.coderscampus.Unit20.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coderscampus.Unit20.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	User findByUsername(String username);
	// SQL Query: select * from user where username = username
}
