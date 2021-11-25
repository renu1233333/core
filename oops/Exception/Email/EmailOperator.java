package com.xworkz.exception;

public class EmailOperator {

	private String[] operator=new String[5];
	private int counter=0;
	
	public void save(String email) throws EmailValidationException
	{
		if(email!=null && this.counter<this.operator.length)
		{
            if(email.contains("@") && email.endsWith(".com")||email.endsWith(".in"))
            {
            	this.operator[this.counter++]=email;
            	System.out.println("stored successfully");
            }
            
            else
            {
            	throw new EmailValidationException("pass correct mail id");
            }
		}
		else
		{
			throw new StorageFullException();
		}
	}
	
}
