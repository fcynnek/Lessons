package com.coderscampus.Unit18.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coderscampus.Unit18.domain.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{

}
