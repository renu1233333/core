package com.xworkz.finalkeyword;
//The type BirthdayEvents cannot subclass the final class Events
public class BirthdayEvents extends Events{
	public  final String name="new year";
	
	
	public BirthdayEvents(String name) {
		super(name);
		
		
		
		// TODO Auto-generated constructor stub
	}

	
	
	public static void main(String[] args) {
		
		
		//The final field Events.name cannot be assigned
		
		Events events=new Events("marraige");
		System.out.println(events.name);
		
		
		System.out.println(BirthdayEvents.age);
		
		
		Events events1=new Events("reunion");
		System.out.println(events1.name);
		
		
		Events events2=new Events("new year");
		System.out.println(events2.name	);
	
		
		

	}

}
