package com.xworkz.dto;

public class WalletDTO {
private String companyName;
private String material;
private int totalCompartment;
private float price;


public WalletDTO() {
	System.out.println("Invoking no argument constructor");
}


public WalletDTO(String companyName, String material, int totalCompartment, float price) {
	super();
	this.companyName = companyName;
	this.material = material;
	this.totalCompartment = totalCompartment;
	this.price = price;
}


public String getCompanyName() {
	return companyName;
}


public void setCompanyName(String companyName) {
	this.companyName = companyName;
}


public String getMaterial() {
	return material;
}


public void setMaterial(String material) {
	this.material = material;
}


public int getTotalCompartment() {
	return totalCompartment;
}


public void setTotalCompartment(int totalCompartment) {
	this.totalCompartment = totalCompartment;
}


public float getPrice() {
	return price;
}


public void setPrice(float price) {
	this.price = price;
}

}
