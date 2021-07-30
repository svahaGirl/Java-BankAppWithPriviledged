package com.perscholas.bankingApplication;

public class CreditCardAccount {

	double balance;

	public CreditCardAccount(double balance) {
		super();
		this.balance = balance;
	}
	public String toString() {
		return "Your credit card balance is "+ this.balance;
		
	}
}

