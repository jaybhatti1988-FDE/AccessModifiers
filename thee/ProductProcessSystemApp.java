package com.java.access.modifiers.examples.thee;

public class ProductProcessSystemApp {

	public static void main(String[] args) {
		
		  System.out.println("╔══════════════════════════════════════════╗");
	      System.out.println("║        E-COMMERCE PRODUCT SYSTEM         ║");
	      System.out.println("╚══════════════════════════════════════════╝");
		
	      Product prd=new Product("PRD1009", "Phone", 22600);
	      
	      prd.displayProductDetails();
	      
	      prd.setPrdName("Samsung Mobile Phone");
	      prd.setPrdPrice(17900);
	      
	      prd.displayProductDetails();
	      prd.applyDiscount(20);
	      System.out.println("\nProduct ID (via getter) : " + prd.getPrdId());
	      System.out.printf ("Final Price (via getter): ₹%.2f%n", prd.getPrdPrice());
	      
	}

}
