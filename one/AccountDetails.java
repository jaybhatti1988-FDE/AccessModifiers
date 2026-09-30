package com.java.access.modifiers.examples.one;

public class AccountDetails {

	public static void main(String[] args) {
		
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║          BANK ACCOUNT SYSTEM             ║");
        System.out.println("╚══════════════════════════════════════════╝");
		
		BankAccount accnt=new BankAccount();
		
		accnt.setAcNumber("ACC450301679");
		accnt.setAcHolderName("Dhiren Shah");
		accnt.setAcBalance(45000);
		
		accnt.displayAccountDetails();
		
		accnt.Deposit(10000);
		accnt.Withdrawl(25000);
		accnt.Withdrawl(100000);
		
		 System.out.println("\n------------------------------------------");
	     System.out.printf("Final Balance (via getter) : ₹%.2f%n", accnt.getAcBalance());
	     System.out.println("------------------------------------------");


	}

}
