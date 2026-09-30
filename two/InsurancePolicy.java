package com.java.access.modifiers.examples.two;

class InsurancePolicy {

	private String policyNumber, policyHolderName;
	private double policyAmount;
	protected String policyCompany;

	public InsurancePolicy(String policyNumber, String policyHolderName, double policyAmount, String policyCompany) {
		this.policyNumber = policyNumber;
		this.policyHolderName = policyHolderName;
		this.policyAmount = policyAmount;
		this.policyCompany = policyCompany;
	}

	public void setPolicyNumber(String policyNumber) {
		if (policyNumber.isEmpty() || policyNumber == null) {
			System.out.println("Policy Number should not empty or Null");
		}
		this.policyNumber = policyNumber;
	}

	public void setPolicyHolderName(String policyHolderName) {
		if (policyHolderName.isEmpty() || policyHolderName == null) {
			System.out.println("Policy Holder Name should not empty or Null");
		}
		this.policyHolderName = policyHolderName;
	}

	public void setPolicyHolderCompany(String policyCompany) {
		if (policyCompany.isEmpty() || policyCompany == null) {
			System.out.println("Insurance Company Name should not empty or Null");
		}
		this.policyCompany = policyCompany;
	}

	public void setPolicyAmount(double policyAmount) {
		if (policyAmount <= 0) {
			System.out.println("Policy Amount should not empty or Null");
		}
		this.policyAmount = policyAmount;
	}

	public void displayPolicyDetails() {
		System.out.println("\n------------------------------------------");
		System.out.println("           POLICY DETAILS                  ");
		System.out.println("------------------------------------------");
		System.out.println("Policy Number      : " + policyNumber);
		System.out.println("Policy Holder Name : " + policyHolderName);
		System.out.println("Policy Amount      : " + policyAmount);
		System.out.println("Insurance Company  : " + policyCompany);
		System.out.println("------------------------------------------");
	}

	public String getPolicyNumber() {
		return policyNumber;
	}

	public String getPolicyHolderName() {
		return policyHolderName;
	}

	public double getPolicyAmount() {
		return policyAmount;
	}

	public String getPolicyCompany() {
		return policyCompany;
	}

}
