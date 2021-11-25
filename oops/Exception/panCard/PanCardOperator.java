package com.xworkz.exception.panCard;

public class PanCardOperator {

	private String[] operator=new String[6];
	
	private int counter=0;
	
	public void save(String pan)throws PanCardValidationException
	{
		if(pan!=null && this.counter<this.operator.length)
		{
			
			String firstPattern=pan.substring(0, 5);
			String secondPattern=pan.substring(5,9);
			String lastPattern=pan.substring(9);
			//System.out.println(firstPattern);
			//System.out.println(secondPattern);
			//System.out.println(lastPattern);
			
			if(pan.length()==10 && firstPattern.matches("[A-Z]+") && secondPattern.matches("[0-9]+") && lastPattern.matches("[A-Z]"))
			{
				this.operator[this.counter]=pan;
				System.out.println("saved successfully "+this.operator[counter]);
				this.counter++;
			
			}
			else
			{System.out.println("exception created");
				throw new PanCardValidationException("passed pancard is not correct ");
			}
			
		}
		else
		{
			throw new StorageFullException("passed pan card is null or storage is full");
			
		}
	
	}
}
