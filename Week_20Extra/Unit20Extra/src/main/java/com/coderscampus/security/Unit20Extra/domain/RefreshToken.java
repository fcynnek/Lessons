package com.coderscampus.security.Unit20Extra.domain;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public record RefreshToken(
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		Long id,
		@OneToOne
		@JoinColumn(name = "user_id", referencedColumnName = "id")
		User user,
		String RefreshToken,
		Date expirationDate) {

}
