package com.java.access.modifiers.examples.five;

public class MainCustomerProcessSystemApp {

	public static void main(String[] args) {
		
		  System.out.println("╔══════════════════════════════════════════╗");
	      System.out.println("║        CUSTOMER BANKING SYSTEM           ║");
	      System.out.println("╚══════════════════════════════════════════╝");
		
	      Customer cust=new Customer("cust1009", "Vinay Shah");
	      cust.displayCustomerDetails();
	      
	      cust.setCustName("Ravi Jani");
	      cust.setCustId("");
	      
	      cust.displayCustomerDetails();
	      
	      System.out.println("\nCustomer ID (via getter)   : " + cust.getCustId());
	        System.out.println("Customer Name (via getter) : " + cust.getCustName());
		
	}

}
