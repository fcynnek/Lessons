package com.coderscampus.security.Unit20Extra.domain;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class  RefreshToken {
// cannot use records to manage the tables because records create the types as final instead of the dynamic types that we have
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		@OneToOne
		@JoinColumn(name = "user_id", referencedColumnName = "id")
		private User user;
		private String RefreshToken;
		private Date expirationDate;
		
		
		public RefreshToken(User user, String refreshToken, Date expirationDate) {
			super();
			this.user = user;
			RefreshToken = refreshToken;
			this.expirationDate = expirationDate;
		}
		
		
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public User getUser() {
			return user;
		}
		public void setUser(User user) {
			this.user = user;
		}
		public String getRefreshToken() {
			return RefreshToken;
		}
		public void setRefreshToken(String refreshToken) {
			RefreshToken = refreshToken;
		}
		public Date getExpirationDate() {
			return expirationDate;
		}
		public void setExpirationDate(Date expirationDate) {
			this.expirationDate = expirationDate;
		}

		
}
