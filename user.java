package com.tap.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class user {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="accountno")
	private int accountno;
	@Column(name="name")
	private String name;
	
	@Column(name="balance")
	private int balance;

	public user() {
		super();
	}
	public user(int id, int accountno, String name, int balance) {
		super();
		this.id = id;
		this.accountno = accountno;
		this.name = name;
		this.balance = balance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAccountno() {
		return accountno;
	}
	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
