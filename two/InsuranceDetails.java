package com.java.access.modifiers.examples.two;

public class InsuranceDetails extends InsurancePolicy {


	private double sumAssure;
	private int policyTermYears;
	
	public InsuranceDetails(String policyNumber, String policyHolderName, double policyAmount, String policyCompany,double sumAssure,int policyTermYears ) {
		super(policyNumber, policyHolderName, policyAmount, policyCompany);
		this.sumAssure=sumAssure;
		this.policyTermYears=policyTermYears;
	}
		
	 public void displayCompanyFromSubclass() {
	        System.out.println("\n------------------------------------------");
	        System.out.println("      ACCESSED VIA SUBCLASS (protected)    ");
	        System.out.println("------------------------------------------");
	        System.out.println("Insurance Company (protected access) : " + policyCompany);
	        System.out.println("------------------------------------------");
	    }
	 
	 @Override
	 public void displayPolicyDetails() {
		 super.displayPolicyDetails();
		 System.out.printf ("Sum Assured        : ₹%.2f%n", sumAssure);
	     System.out.println("Policy Term        : " + policyTermYears + " Year(s)");
	     System.out.println("------------------------------------------");
	 }

}
