package com.coderscampus.security.Unit20Extra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coderscampus.security.Unit20Extra.domain.User;

@Repository
public interface UserRepository extends JpaRepository <User, Integer> {

	User findByUsername (String username);
}
