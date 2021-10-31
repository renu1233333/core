package com.xworkz.factory;

 public class SugarFactory extends Factory{

	private String name="shilpa";
	public int age=23;
	
	
	public String getName()
	{
		return this.name;
	}
	
	public void hiding()
	{
		System.out.println("Hiding the parent class");
	}
	
	public void sum()
	{int age=27;
	   System.out.println("invoking child class");
	   System.out.println("******************************");
	   System.out.println(age);
	   System.out.println(this.age);
	   System.out.println(super.age);
	   
	}
	public SugarFactory() {
		
		super();
	
		System.out.println("Invoking no argument SugarFactory constructor");
		
	}
	
	public SugarFactory(String ownername, String product, int noOfWorkers, int since)
	{
		super(ownername,product,noOfWorkers,since);
	}
	
	
	
	
}
