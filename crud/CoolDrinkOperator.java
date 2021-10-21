package com.xworkz.crud.operation;

public class CoolDrinkOperator {

	private String[] brandName=new String[6];
	private int happident;
	
	
	public void addName(String name)
	{
		System.out.println("Invoked addName ".concat(name).concat(" with index ").concat(String.valueOf(this.happident)));
		if(this.happident<this.brandName.length)
		{
			this.brandName[this.happident++]=name;
		}
		else
		{
			System.err.println("cannot add .array is full beacause index is more than ".concat(String.valueOf(this.brandName.length)));
		}
	}
	
	public String[] getName() {
		return brandName;

	}
	
	public void deleteName(int kona)
	{
		if(kona>=0 && kona<this.brandName.length)
		{
			this.brandName[kona]=null;
		}
		else
		{
			System.err.println("cannot add kona.kona should be between zero and ".concat(String.valueOf(this.brandName.length)));
			
		}
	}
	
	public void update(int galaxy,String name)
	{
		if(name!=null)
		{
			if(galaxy<this.brandName.length && galaxy>=0)
			{
				this.brandName[galaxy]=name;
			}
			else
			{
				System.out.println("cannot upadte galaxy.should be between zero and ".concat(String.valueOf(this.brandName.length)));
				
			}
		}
		else
		{
			System.err.println("cannot update because updated name is null");
		}
	}
	
}
