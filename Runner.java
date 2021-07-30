package com.perscholas.bankingApplication;

	import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.Random;
	import java.util.Scanner;
	
	public class Runner {

		public static void main(String[] args)  {
			// TODO Auto-generated method stub
			Scanner sc  = new Scanner(System.in);
			System.out.println("THE " + Account.BANK_NAME + " BANKING FACILITY" );
			
			System.out.println();
			
			System.out.println("Please login below \n" );
		
			//data
			
			Account accountOne = new CheckingAccount("sanjaya", "password1",false, false, true,false,10000);
			Account accountTwo = new SavingsAccount("allen","password2",true,true,false,true,5000);
			Account accountThree = new CheckingAccount("bill","password3",true,true,true,false,5000);
			Account accountFour = new SavingsAccount("peter","password4",true,true,false,true,5000);
			Account accountFive = new CheckingAccount("kyle","password5",true,false,true,false,5000);
			Account accountSix = new SavingsAccount("tom","password6",true,true,false,true,5000);
			Account accountSeven = new CheckingAccount("travis","password7",true,true,true,false,5000);
			Account accountEight = new SavingsAccount("mark","password8",true,true,false,true,5000);
			Account accountNine = new CheckingAccount("rob","password9",true,false,true,false,5000);
			Account accountTen = new SavingsAccount("lizy","password10",false,true,false,true,5000);
			//Account accountThree = new 
			
			ArrayList<Account> myList = new ArrayList<Account>();
			myList.add(accountOne);
			myList.add(accountTwo);
			myList.add(accountThree);
			myList.add(accountFour);
			myList.add(accountFive);
			myList.add(accountSix);
			myList.add(accountSeven);
			myList.add(accountEight);
			myList.add(accountNine);
			myList.add(accountTen);
			
			String input1 = "";
			String input2 = "";
			//String name = accountOne.getUserName();
			boolean flag = false;
			int i = 0;
			do {
			System.out.print("Enter your Username:");
			input1 = sc.next();
		    System.out.print("Enter your password:");
			input2 = sc.next();
			System.out.println("--------------------------------------------------");
			
			Iterator itr = myList.iterator();
			while(itr.hasNext()) {
				Account acc = (Account) itr.next();
			if(input1.equals(acc.getUserName()) && input2.equals(acc.getPassword())) {
				System.out.print("Welcome!! you have an account with us.\n");
				
				do {
				System.out.println("Please choose one of the option below: "
						+ "\n" + "1. Checking Account \n"
						 + "2. Savings Account \n"+ "3. Previledge Account \n" + "4. Credit Card Account\n" + "5. Exit");
				
				System.out.println();
				Scanner sc1  = new Scanner(System.in);
				System.out.print("Please enter a number between 1 - 5 :");  i = sc.nextInt();
				System.out.println("-------------------------------------------------------");
				
				//System.out.println();
				
				if(i==1) {
					if(acc.hasCheckingAccount) {
					
					System.out.print("Welcome to the checking account\n");
					System.out.print("Please find your Account details below:\n");
					System.out.println(acc.toString());
					System.out.println();
					int input4 = 0;
					do {
						System.out.println("You have the following options:");
						System.out.println("1. Deposit \n2. Withdraw\n3. Exit");
						System.out.print("Please enter a number between 1 - 3 :");input4 = sc.nextInt();
						
						double input3 = 0;
						if(input4==1) {
							System.out.println("Enter the deposit amount:"); input3 = sc.nextDouble();
							double balance = acc.deposit(input3);
							System.out.println("Balance after deposit: " + balance); 
							acc.updateBalance(balance);
							System.out.println();
							
						}
						else if(input4==2) {
							System.out.println("Enter the withdraw amount:"); input3 = sc.nextDouble();
							double newBalance = acc.withdraw(input3);
							System.out.println("Balance: " + newBalance);
							acc.updateBalance(newBalance);
							System.out.println();
						}
					}while(input4!=3);
					System.out.println("Thanks!! Exiting checking account");
						
					}
					else {
						System.out.println("Sorry, You do not have checking account");
					}
					System.out.println("-------------------------------------------------------");
					
				}
				else if(i==2) {
					if(acc.hasSavingAccount) {

				    System.out.print("Welcome to the saving account\n");
				    System.out.print("Please find your Account details below:\n");
					System.out.println(acc.toString());
					System.out.println();
					
					int input4 = 0;
					do {
						System.out.println("You have the following options:");
						System.out.println("1. Deposit \n2. Withdraw\n3. Exit");
						System.out.print("Please enter a number between 1 - 3 :");input4 = sc.nextInt();
						
						double input3 = 0;
						if(input4==1) {
							System.out.println("Enter the deposit amount:"); input3 = sc.nextDouble();
							double balance = acc.deposit(input3);
							System.out.println("Balance after deposit: " + balance); 
							acc.updateBalance(balance);
							System.out.println();
							
						}
						else if(input4==2) {
							System.out.println("Enter the withdraw amount:"); input3 = sc.nextDouble();
							double newBalance = acc.withdraw(input3);
							System.out.println("Balance: " + newBalance);
							acc.updateBalance(newBalance);
							System.out.println();
						}
					}while(input4!=3);
					System.out.println("Thanks!! Exiting saving account");
					
					
					}
					else {
						System.out.println("Sorry, You do not have saving account");
					}
					System.out.println("-------------------------------------------------------");
					}//else if
				else if(i==3) {
					if(acc.hasPriviledgedAccount) {

				    System.out.print("Welcome to the Priviledge account\n");
				    System.out.print("You have Over Draft facility\n");
				    //System.out.print("Please find your Account details below:\n");
					//System.out.println(acc.toString());
				    
					}
					else {
						System.out.println("Sorry, You do not have Priviledge account");
					}
					System.out.println("-------------------------------------------------------");
					}//else if
				
				else if(i==4) {
					if(acc.hascreditCard) {

				    System.out.print("Welcome to the credit card account\n");
				    System.out.print("Please find your Account details below:\n");
				    Random rd = new Random();
				    double number = rd.nextDouble()*10000;
				    number = Math.rint(number);
				    CreditCardAccount cc = new CreditCardAccount(number);
					System.out.println(cc.toString());
					}
					else {
						System.out.println("Sorry, You do not have credit card account");
					}
					System.out.println("-------------------------------------------------------");
					}//else if
				flag = true;
				   }
					while(i!=5);
					System.out.println("Thank you for doing business with us.\nhave a nice day!");
				}//end if
				
				}//end while
				if(flag==false)
				System.out.println("Username and Password does not match\nPlease try again!!");
			}while(flag==false);							
}
}