package com.xworkz.shop.saloon;

public class NaturalSaloon extends Saloon
{
	 String name1="hcl";
     String name="renu software developer"; 
	public NaturalSaloon() {
		super();
		//this("VIGNESH SOFTWARE ENGINEER");
		System.out.println("invoking public no argument natural saloon constructor");
		
	}
	public NaturalSaloon(String name)
	{
		System.out.println("invoking public parameter constructor  ");
	}
	
}
