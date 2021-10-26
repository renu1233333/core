package com.xworkz.dto;

public class MilkCanDTO {
private Integer quantity;
private boolean quality;
private float price;

public MilkCanDTO() {
	// TODO Auto-generated constructor stub
	System.out.println("Invoking no argument constructor");
}

public MilkCanDTO(int quantity, boolean quality, float price) {
	super();
	this.quantity = quantity;
	this.quality = quality;
	this.price = price;
}

public Integer getQuantity() {
	return quantity;
}

public void setQuantity(Integer quantity) {
	this.quantity = quantity;
}

public boolean isQuality() {
	return quality;
}

public void setQuality(boolean quality) {
	this.quality = quality;
}

public float getPrice() {
	return price;
}

public void setPrice(float price) {
	this.price = price;
}

}
