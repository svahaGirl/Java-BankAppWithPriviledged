/*Banking Application requirement:
 * user will have to enter all the required information 
 */
//	like, name, account number,account   type   and   initial   balance
//	and   using   the   switch   case   statement   they   canselect the 
//	type of transaction they want to do, and they get information regardingtheir 
//	balance also.
//	The   Bank   account   has   the   properties   User  Name, User ssn, User Address,
//	BankName , Bank Address, routing Number, account number, balance,annual, interest rate,
//	tax and date created, and methods to  deposit() andwithdraw().   Create   one   parent   class  
//	for  Banking  and   four   sub   classes   forchecking account, creditCard, privileged and savings account.
//	You are supposed to take an input from user via console. User will be able to selectone option from four options. 
//	Such as define below1 – checking account2 – saving account3 – privileges account4 - credit card You   are   free  
//	to   add   any   properties   or   features   in   each   class   such   as   withdraw,deposit, calculateTax, 
//	calucateAmountdue.You are supposed to add functionality privileged Banking Account  with OverdraftFacility. 
//	For a background, overdraft is a facility where you can withdraw an amount more than available the balance in your account.
//	You are supposed to add functionality in Creditcard, Users can pay the all dues.User will be able to add year, month and total
//	amount as an input from console*/

package com.perscholas.bankingApplication;

public abstract class Account {
	
	private String userName;
	private String password;
	private int userSsn;
	private String userAddress;
	public static final String BANK_NAME = "PER-SCHOLAS";
	private String bankAddress;
	private double annualInterestRate;
	private double tax;
	boolean hasPriviledgedAccount;
	boolean hascreditCard;
	boolean hasCheckingAccount;
	boolean hasSavingAccount;
	
	public Account() {
		super();
	}

	public Account(String userName, String password, 
		    boolean hasPriviledgedAccount, boolean hascreditCard,
			boolean hasCheckingAccount, boolean hasSavingAccount) {
		super();
		this.userName = userName;
		this.password = password;
		this.hasPriviledgedAccount = hasPriviledgedAccount;
		this.hascreditCard = hascreditCard;
		this.hasCheckingAccount = hasCheckingAccount;
		this.hasSavingAccount = hasSavingAccount;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getUserSsn() {
		return userSsn;
	}

	public void setUserSsn(int userSsn) {
		this.userSsn = userSsn;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getBankAddress() {
		return bankAddress;
	}

	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public boolean isHasPriviledgedAccount() {
		return hasPriviledgedAccount;
	}

	public void setHasPriviledgedAccount(boolean hasPriviledgedAccount) {
		this.hasPriviledgedAccount = hasPriviledgedAccount;
	}

	public boolean isHascreditCard() {
		return hascreditCard;
	}

	public void setHascreditCard(boolean hascreditCard) {
		this.hascreditCard = hascreditCard;
	}

	public boolean isHasCheckingAccount() {
		return hasCheckingAccount;
	}

	public void setHasCheckingAccount(boolean hasCheckingAccount) {
		this.hasCheckingAccount = hasCheckingAccount;
	}

	public boolean isHasSavingAccount() {
		return hasSavingAccount;
	}

	public void setHasSavingAccount(boolean hasSavingAccount) {
		this.hasSavingAccount = hasSavingAccount;
	}

	public static String getBankName() {
		return BANK_NAME;
	}
	
	//deposit and withdraw and update and get balance methods
	public abstract double deposit(double depositAmount);
	public abstract double withdraw(double withdrawAmount);
	public abstract void updateBalance(double balance);
	public abstract double getBalance();
	
	// toString
	@Override
	public String toString() {
		return "Account [userName=" + userName + ", userAddress=" + userAddress +",bankName= " + BANK_NAME + ", bankAddress=" + bankAddress
				+ ", annualInterestRate=" + annualInterestRate + ", tax=" + tax + "]";
	}
	

	

	
}
