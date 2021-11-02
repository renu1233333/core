package com.xworkz.deepavali.police;

public class TrafficPolice extends Police{

	
	public TrafficPolice()
	{
		super();
		System.out.println(super.name);
		System.out.println(super.designation);
		System.out.println(super.exp);
		System.out.println(super.noOfStars);
		System.out.println(super.dept);
	}
	
	
	public void displayDetails()
	{
		System.out.println("invoking displayDetails in Traffic Police");
	}
}
