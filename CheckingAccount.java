package com.perscholas.bankingApplication;

import java.time.LocalDate;

public class CheckingAccount extends Account {

	//properties
	
	private static int routingNumber;
	private int accountNumber;
	private double checkingBalance ;
	private LocalDate dateCreated;
	
	public CheckingAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CheckingAccount(String userName, String password, boolean hasPriviledgedAccount, boolean hascreditCard,
			boolean hasCheckingAccount, boolean hasSavingAccount, double checkingBalance) {
		super(userName, password, hasPriviledgedAccount, hascreditCard, hasCheckingAccount, hasSavingAccount);
		// TODO Auto-generated constructor stub
		this.checkingBalance = checkingBalance;
		this.dateCreated = LocalDate.now();
	}

  public static int getRoutingNumber() {
		return routingNumber;
	}
	public static void setRoutingNumber(int routingNumber) {
		CheckingAccount.routingNumber = routingNumber;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	
	public double getCheckingBalance() {
		return checkingBalance;
	}
	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}
	
	public double getBalance() {
		
		
		return this.checkingBalance;
		
	}
	
	
	@Override
	public double deposit(double depositAmount) {
		// TODO Auto-generated method stub
		this.checkingBalance = this.checkingBalance + depositAmount;
		System.out.println("you have succesfully deposited $" + depositAmount);
		return this.checkingBalance;
	}
	@Override
	public double withdraw(double withdrawAmount) {
		// TODO Auto-generated method stub
		if(this.checkingBalance >= withdrawAmount && !(this.hasPriviledgedAccount)) {
		this.checkingBalance = this.checkingBalance - withdrawAmount;
		System.out.println("You've successfully withdrawn $"+withdrawAmount + " from your checking account." );
		
		}//end if
		else if(this.hasPriviledgedAccount) {
			System.out.println("You have an priviledged account,you have privilege to Overdraft");
			this.checkingBalance = this.checkingBalance - withdrawAmount;
		}
		
	     else {
			System.out.println("Alert!! You do not have enough balance, and you do not have privilege to Overdraft,please try again.");
		}
		return this.checkingBalance;
	}
	public void updateBalance(double balance) {
		this.setCheckingBalance(balance);
		
		
	}
	@Override
	public String toString() {
		return "CheckingAccount : [userName = " + this.getUserName()+ ", checkingBalance=" + this.checkingBalance
				+ ", dateCreated=" + dateCreated + "]";
	}
}