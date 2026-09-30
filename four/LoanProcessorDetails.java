package com.java.access.modifiers.examples.four;

class LoanProcessorDetails  {


	public void LoanProcess(Loan loan) {
		System.out.println("\n------------------------------------------");
        System.out.println("      ACCESSED VIA SAME-PACKAGE CLASS      ");
        System.out.println("------------------------------------------");
        
        System.out.println("Loan Type (default access) : " + loan.loanType);

        System.out.printf("Loan Amount (via getter)   : ₹%.2f%n", loan.getLoanAmount());
        System.out.println("------------------------------------------");
    }
}
