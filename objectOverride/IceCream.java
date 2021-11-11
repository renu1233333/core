package com.xworkz.objectoverride;

import com.xworkz.objectoverride.constants.Flavour;

public class IceCream {

	private String name;
	private Flavour type;
	private String shape;
	private float price;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getPrice() {
		return price;
	}
	
	
	@Override
	public String toString() {
		System.out.println("invoked tostring");
		return "varsha";
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 100;
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
	if(obj==null)
	{		
		System.out.println("you are passing null.check once again");
		return false;
	}
	if(obj instanceof IceCream)
	{
	IceCream ice=(IceCream)obj;
	String nameRef=ice.getName();
	System.out.println(nameRef);
	float iceRef=ice.getPrice();
	Float icecreamRef=Float.valueOf(iceRef);
	Float priceRef=Float.valueOf(price);
	
	
	if(this.name.equals(nameRef) && priceRef.equals(icecreamRef)) {
		System.out.println("matched");
		return true;
	}
	
	
	
	}
	return false;
	}
}
