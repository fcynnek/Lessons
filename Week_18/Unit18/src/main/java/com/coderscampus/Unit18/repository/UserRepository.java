package com.coderscampus.Unit18.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coderscampus.Unit18.domain.User;

// to leverage the JPA code to manipulate the repository, we change the class to interface and extends JpaRepository
// this extends requires a T, and ID -> Type is going to reference the domain. ID is the data type for the primary key
@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
