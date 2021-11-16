package com.xworkz.finalkeyword;

public  class Events {
//cannot give static with final to the variable
	public  final String name;
	public static final int age;
	private int noOfPeople;
	
		public Events(String name)
	{
		
		this.name=name;
		System.out.println(this.name);
		
		
	}
		static {
			age=38;
		}
		
		public  void gather()
		{
			System.out.println("invoked gather method");
		
		}	
}
