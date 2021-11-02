package com.xworkz.deepavali.police;
import com.xworkz.deepavali.constants.*;
public class Police {

	static  String name="pooja";
	protected String designation;
	protected float exp;
	protected PoliceDept dept;
	protected int noOfStars;
	
	public Police()
	{  super();
		System.out.println("Invoking no arg const of police");
	}
	
	public void testMethod()
	{
		System.out.println("invoked");
	}
	
	public void displayDetails()
	{
		System.out.println("invoking displayDetails form police");
	}
}
