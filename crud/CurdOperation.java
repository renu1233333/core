package com.xworkz.crud.operation;

public class CurdOperation {

	String[] labour=new String[4];
	String[] cofee=new String[4];
	String[] airport=new String[4];
	String[] stadium=new String[4];
private int happident;
//Labour
	
	public void addLabour(String name)
	{
		System.out.println("Invoked addLabour ".concat(name).concat(" with index ").concat(String.valueOf(this.happident)));
		if(this.happident<this.labour.length)
		{
			this.labour[this.happident++]=name;
		}
		else
		{
			System.err.println("cannot add .array is full beacause index is more than ".concat(String.valueOf(this.labour.length)));
		}
	}
	
	
	public void deleteLabour(int kona)
	{
		if(kona>=0 && kona<this.labour.length)
		{
			this.labour[kona]=null;
		}
		else
		{
			System.err.println("cannot add . should be between zero and ".concat(String.valueOf(this.labour.length)));
			
		}
	}
	
	public void updateLabour(int galaxy,String name)
	{
		if(name!=null)
		{
			if(galaxy<this.labour.length && galaxy>=0)
			{
				this.labour[galaxy]=name;
			}
			else
			{
				System.out.println("cannot upadte .should be between zero and ".concat(String.valueOf(this.labour.length)));
				
			}
		}
		else
		{
			System.err.println("cannot update because updated name is null");
		}
	}
	
	public void displayLabour()
	{
		for(int i=0;i<labour.length;i++)
		{
			System.out.println(labour[i]);
		}

	}
	
	
//cofee
	
	public void addCofee(String name)
	{
		System.out.println("Invoked addCofee ".concat(name).concat(" with index ").concat(String.valueOf(this.happident)));
		if(this.happident<this.cofee.length)
		{  
			this.cofee[this.happident++]=name;
		}
		else
		{
			System.err.println("cannot add .array is full beacause index is more than ".concat(String.valueOf(this.cofee.length)));
		}
	}
	
	
	public void deleteCofee(int kona)
	{
		if(kona>=0 && kona<this.cofee.length)
		{
			this.cofee[kona]=null;
		}
		else
		{
			System.err.println("cannot add . should be between zero and ".concat(String.valueOf(this.cofee.length)));
			
		}
	}
	
	public void updateCofee(int galaxy,String name)
	{
		if(name!=null)
		{
			if(galaxy<this.cofee.length && galaxy>=0)
			{
				this.cofee[galaxy]=name;
			}
			else
			{
				System.out.println("cannot upadte .should be between zero and ".concat(String.valueOf(this.cofee.length)));
				
			}
		}
		else
		{
			System.err.println("cannot update because updated name is null");
		}
	}
	
	public void displayCofee()
	{
		for(int i=0;i<cofee.length;i++)
		{
			System.out.println(cofee[i]);
		}

	}
	
//Airport
	
	public void addAirport(String name)
	{
		System.out.println("Invoked addAirport ".concat(name).concat(" with index ").concat(String.valueOf(this.happident)));
		if(this.happident<this.airport.length)
		{
			this.airport[this.happident++]=name;
		}
		else
		{
			System.err.println("cannot add .array is full beacause index is more than ".concat(String.valueOf(this.airport.length)));
		}
	}
	
	
	public void deleteAirport(int kona)
	{
		if(kona>=0 && kona<this.airport.length)
		{
			this.airport[kona]=null;
		}
		else
		{
			System.err.println("cannot add . should be between zero and ".concat(String.valueOf(this.airport.length)));
			
		}
	}
	
	public void updateAirport(int galaxy,String name)
	{
		if(name!=null)
		{
			if(galaxy<this.airport.length && galaxy>=0)
			{
				this.airport[galaxy]=name;
			}
			else
			{
				System.out.println("cannot upadte .should be between zero and ".concat(String.valueOf(this.airport.length)));
				
			}
		}
		else
		{
			System.err.println("cannot update because updated name is null");
		}
	}
	
	public void displayAirport()
	{
		for(int i=0;i<airport.length;i++)
		{
			System.out.println(airport[i]);
		}

	}
		
	
//	stadium
	
	public void addStadium(String name)
	{
		System.out.println("Invoked addStadium ".concat(name).concat(" with index ").concat(String.valueOf(this.happident)));
		if(this.happident<this.stadium.length)
		{
			this.stadium[this.happident++]=name;
		}
		else
		{
			System.err.println("cannot add .array is full beacause index is more than ".concat(String.valueOf(this.stadium.length)));
		}
	}
	
	
	public void deleteStadium(int kona)
	{
		if(kona>=0 && kona<this.stadium.length)
		{
			this.stadium[kona]=null;
		}
		else
		{
			System.err.println("cannot add . should be between zero and ".concat(String.valueOf(this.stadium.length)));
			
		}
	}
	
	public void updateStadium(int galaxy,String name)
	{
		if(name!=null)
		{
			if(galaxy<this.stadium.length && galaxy>=0)
			{
				this.stadium[galaxy]=name;
			}
			else
			{
				System.out.println("cannot upadte .should be between zero and ".concat(String.valueOf(this.stadium.length)));
				
			}
		}
		else
		{
			System.err.println("cannot update because updated name is null");
		}
	}
	
	public void displayStadium()
	{
		for(int i=0;i<stadium.length;i++)
		{
			System.out.println(stadium[i]);
		}

	}
	
	
}
