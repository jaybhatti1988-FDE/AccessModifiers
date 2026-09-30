package com.java.access.modifiers.examples.one;

class BankAccount {
	
	private String acNumber,acHolderName;
	private double acBalance;
	

	public void setAcNumber(String acNumber) {
		if (acNumber.isEmpty()|| acNumber==null) {
			System.out.println("Account Number should not empty or Null");
		}
		this.acNumber = acNumber;
	}
	
	public void setAcHolderName(String acHolderName) {
		if (acHolderName.isEmpty()|| acHolderName==null) {
			System.out.println("Account Holder Name should not empty or Null");
		}
		this.acHolderName = acHolderName;
	}

	public void setAcBalance(double acBalance) {
		if (acBalance<=0) {
			System.out.println("Account Balance should not empty or Null");
		}
		this.acBalance = acBalance;
	}
	
	
	public void Deposit(double amount) {
		if (amount<=0) {
			System.out.println("Amount should not negative or Zero");
		} else {
			acBalance=acBalance+amount;
			System.out.printf("Amount ₹%.2f" , acBalance , " Credited Successfully...!  ");
		}
	}
	
	public void Withdrawl(double amount) {
		if (amount<=0) {
			System.out.println("Amount should not negative or Zero");
		}else if (amount>acBalance) {
			System.out.println("!Oops.... Sorry your Account has Insufficient Balance for Withdrawl");
		} else {
			acBalance=acBalance-amount;
			System.out.printf("Amount ₹%.2f" , acBalance , " Debited Successfully...!  ");
		}
	}
	
	  public void displayAccountDetails() {
	        System.out.println("\n------------------------------------------");
	        System.out.println("           ACCOUNT DETAILS                 ");
	        System.out.println("------------------------------------------");
	        System.out.println("Account Number   : " + acNumber);
	        System.out.println("Account Holder   : " + acHolderName);
	        System.out.printf ("Current Balance  : ₹%.2f%n", acBalance);
	        System.out.println("------------------------------------------");
	    }
	
	
	public String getAcNumber() {
		return acNumber;
	}
	
	public String getAcHolderName() {
		return acHolderName;
	}
	
	public double getAcBalance() {
		return acBalance;
	}

}
