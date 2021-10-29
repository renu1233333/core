package com.xworkz.factory;

 public class SugarFactory extends Factory{

	private String name="shilpa";
	public String getName()
	{
		return this.name;
	}
	
	public void hiding()
	{
		System.out.println("Hiding the parent class");
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
