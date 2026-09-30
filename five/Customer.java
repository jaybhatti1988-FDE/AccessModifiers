package com.java.access.modifiers.examples.five;

class Customer {

	private String custId,custName;

	public Customer(String custId, String custName) {
		this.custId = custId;
		this.custName = custName;
	}
	public void setCustId(String custId) {
		if (custId.trim().isEmpty() || custId == null) {
			System.out.println("Customer Id should not empty or Null");
		}else {
			this.custId = custId;
		}
		
	}

	public void setCustName(String custName) {
		if (custName.trim().isEmpty() || custName == null) {
			System.out.println("Customer Name should not empty or Null");
		}else {
			this.custName = custName;
		}
		
	}

	public void displayCustomerDetails() {
		System.out.println("\n------------------------------------------");
		System.out.println("           CUSTOMER DETAILS                  ");
		System.out.println("---------------------------------------------");
		System.out.println("Customer ID      : " + custId);
		System.out.println("Customer Name    : " + custName);
		System.out.println("------------------------------------------");
	}
	public String getCustId() {
		return custId;
	}
	public String getCustName() {
		return custName;
	}	
}
