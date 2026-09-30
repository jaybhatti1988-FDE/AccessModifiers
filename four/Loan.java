package com.java.access.modifiers.examples.four;

class Loan {

	String loanType;
	private double loanAmount;
	protected String loanCompany;

	public Loan(String loanType, double loanAmount, String loanCompany) {
		this.loanType = loanType;
		this.loanAmount = loanAmount;
		this.loanCompany = loanCompany;
	}

	public void setLoanType(String loanType) {
		if (loanType.isEmpty() || loanType == null) {
			System.out.println("Loan Type should not empty or Null");
		}
		this.loanType = loanType;
	}


	public void setLoanCompany(String loanCompany) {
		if (loanCompany.isEmpty() || loanCompany == null) {
			System.out.println("Loan Company Name should not empty or Null");
		}
		this.loanCompany = loanCompany;
	}

	public void setLoanAmount(double loanAmount) {
		if (loanAmount <= 0) {
			System.out.println("Loan Amount should not empty or Null");
		}
		this.loanAmount = loanAmount;
	}

	public void displayLoanDetails() {
		System.out.println("\n------------------------------------------");
		System.out.println("           LOAN DETAILS                  ");
		System.out.println("------------------------------------------");
		System.out.println("Loan Type      : " + loanType);
		System.out.println("Loan Amount    : " + loanAmount);
		System.out.println("Loan Company   : " + loanCompany);
		System.out.println("------------------------------------------");
	}

	public String getLoanType() {
		return loanType;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public String getLoanCompany() {
		return loanCompany;
	}

	

}
