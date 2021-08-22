package com.greatlearning.model;

public class Customer {

	private String password;
	private int bankAccount;
	private int balance;


	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}


	public Customer(String password, int bankAccount, int balance) {
		super();
		this.password = password;
		this.bankAccount = bankAccount;
		this.balance = balance;
	}
	public Customer(String password, int bankAccount) {
		super();
		this.password = password;
		this.bankAccount = bankAccount;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public int getBankAccount() {
		return bankAccount;
	}


	public void setBankAccount(int bankAccount) {
		this.bankAccount = bankAccount;
	}


	public Customer() {
		// TODO Auto-generated constructor stub
	}

}
