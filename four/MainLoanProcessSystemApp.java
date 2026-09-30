package com.java.access.modifiers.examples.four;

public class MainLoanProcessSystemApp {

	public static void main(String[] args) {
		
		  System.out.println("╔══════════════════════════════════════════╗");
	      System.out.println("║        INSURANCE POLICY SYSTEM           ║");
	      System.out.println("╚══════════════════════════════════════════╝");
		
		Loan lan=new Loan("Home Loan", 2500000, "SBI Home Loan");
		lan.displayLoanDetails();
		
        System.out.println("\nDirect access from main (same package) : " + lan.loanType);

		
		LoanProcessorDetails landtils=new LoanProcessorDetails();
		landtils.LoanProcess(lan);
	}

}
