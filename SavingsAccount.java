package com.perscholas.bankingApplication;


import java.time.LocalDate;

public class SavingsAccount extends Account {

	// properties
	private static int savingAccountRoutingNumber;
	private int savingAccountNumber;
	private double savingAccountBalance;
	private LocalDate dateCreated;

	//Constructors
     public SavingsAccount() {
	     super();
     }
     
    public SavingsAccount(String userName, String password, boolean hasPriviledgedAccount, boolean hascreditCard,
			boolean hasCheckingAccount, boolean hasSavingAccount,double savingAccountBalance) {
		super(userName, password, hasPriviledgedAccount, hascreditCard, hasCheckingAccount, hasSavingAccount);
		// TODO Auto-generated constructor stub
		this.savingAccountBalance = savingAccountBalance;
		this.dateCreated = LocalDate.now();
	}

	//getter and setter
	public static int getSavingAccountRoutingNumber() {
		return savingAccountRoutingNumber;
	}
	public static void setSavingAccountRoutingNumber(int savingAccountRoutingNumber) {
		SavingsAccount.savingAccountRoutingNumber = savingAccountRoutingNumber;
	}
	public int getSavingAccountNumber() {
		return savingAccountNumber;
	}
	public void setSavingAccountNumber(int savingAccountNumber) {
		this.savingAccountNumber = savingAccountNumber;
	}
	public double getSavingAccountBalance() {
		return savingAccountBalance;
	}
	public void setSavingAccountBalance(double savingAccountBalance) {
		this.savingAccountBalance = savingAccountBalance;
	}
	public LocalDate getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(LocalDate dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	//methods
	
	@Override
	public String toString() {
		return "SavingsAccount [userName = " + getUserName() + ", savingAccountBalance="
				+ savingAccountBalance + ", dateCreated=" + dateCreated + "]";
	}
	@Override
	public double deposit(double depositAmount) {
		// TODO Auto-generated method stub
		this.savingAccountBalance = this.savingAccountBalance + depositAmount;
		System.out.println("you have succesfully deposited $" + depositAmount);
		return this.savingAccountBalance;
	}
	
	@Override
	public double withdraw(double withdrawAmount) {
		// TODO Auto-generated method stub
		if(this.savingAccountBalance >= withdrawAmount && !(this.hasPriviledgedAccount)) {
			this.savingAccountBalance = this.savingAccountBalance - withdrawAmount;
			System.out.println("You've successfully withdrawn $"+withdrawAmount + " from your saving account." );
			
			}//end if
		else if(this.hasPriviledgedAccount) {
			this.savingAccountBalance = this.savingAccountBalance - withdrawAmount;
		}
			
		     else {
				System.out.println("Alert!! You do not have enough balance.");
			}
			return this.savingAccountBalance;
	}

	@Override
	public void updateBalance(double balance) {
		// TODO Auto-generated method stub
		this.setSavingAccountBalance(balance);
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return this.getSavingAccountBalance();
	}

}

