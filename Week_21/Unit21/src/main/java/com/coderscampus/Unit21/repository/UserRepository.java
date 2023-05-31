package com.coderscampus.Unit21.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coderscampus.Unit21.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	// this automatically generates a SQL query
	User findByUsername(String username);

}
