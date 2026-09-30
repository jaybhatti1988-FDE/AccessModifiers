package com.java.access.modifiers.examples.two;

public class MainInsurancePolicySystemApp {

	public static void main(String[] args) {
		
		  System.out.println("╔══════════════════════════════════════════╗");
	      System.out.println("║        INSURANCE POLICY SYSTEM           ║");
	      System.out.println("╚══════════════════════════════════════════╝");
		
		InsurancePolicy policy=new InsurancePolicy("POL220991", "Dhiren Shah", 24000.00, "Medical-Care");

		InsuranceDetails policydetails=new InsuranceDetails("POL220991", "Dhiren Shah", 24000.00, "Medical-Care",1500000,20);
		policydetails.displayPolicyDetails();
		policydetails.displayCompanyFromSubclass();
	}

}
