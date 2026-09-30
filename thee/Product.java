package com.java.access.modifiers.examples.thee;

class Product {

	private String prdId,prdName;
	private double prdPrice;
	

	public Product(String prdId,String prdName,double prdPrice) {
		this.prdId = prdId;
		this.prdName=prdName;
		setPrdPrice(prdPrice);
	}

	public void setPrdId(String prdId) {
		if (prdId.isEmpty() || prdId == null) {
			System.out.println("Product Id should not empty or Null");
		}
		this.prdId = prdId;
	}
	
	public void setPrdName(String prdName) {
		if (prdName.isEmpty() || prdName == null) {
			System.out.println("Product Name should not empty or Null");
		}
		this.prdName = prdName;
	}

	public void setPrdPrice(double prdPrice) {
		if (prdPrice <= 0) {
			System.out.println("Product Price should not empty or Null");
		}
		this.prdPrice = prdPrice;
	}
	
	public void applyDiscount(double discount) {
		if (discount<=0||discount>=100) {
			System.out.println("Invalid Discount: Must be between 0 and 100.");
		} else {
			double discountAmt=(prdPrice*discount)/100;
			prdPrice-=discountAmt;
			System.out.printf("Discount of %.2f%% applied. New Price: ₹%.2f%n",discount,prdPrice);
		}
	}

	public void displayProductDetails() {
		System.out.println("\n------------------------------------------");
		System.out.println("           PRODUCT DETAILS                  ");
		System.out.println("------------------------------------------");
		System.out.printf("\nProduct Type      : "+  prdId);
		System.out.printf("\nProduct Name      : "+  prdName);
		System.out.printf("\nProduct Amount    : ₹%.2f%n", prdPrice);
		System.out.println("------------------------------------------");
	}

	public String getPrdId() {
		return prdId;
	}

	public double getPrdPrice() {
		return prdPrice;
	}

	public String getPrdName() {
		return prdName;
	}
	
	
}
