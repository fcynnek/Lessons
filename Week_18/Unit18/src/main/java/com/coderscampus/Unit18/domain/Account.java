package com.coderscampus.Unit18.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name="accounts")
public class Account {
	
	private Long accountId;
	private String accountName;
	// To map a 1:many relationship
	private List<Transaction> transactions = new ArrayList<>();
	private List<User> users = new ArrayList<>();
	
	// we can also put the annotations in the private declarations
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getAccountId() {
		return accountId;
	}
	
	@Column(length = 100)
	public String getAccountName() {
		return accountName;
	}
	
	
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	@OneToMany(mappedBy = "account")
	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	
	@ManyToMany(mappedBy = "accounts")
	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
}
