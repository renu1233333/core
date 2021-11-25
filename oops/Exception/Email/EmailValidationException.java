package com.xworkz.exception;

public class EmailValidationException extends Exception{

	public EmailValidationException() {
		super();
	}
	
	
	public EmailValidationException(String msg)
	{
		super(msg);
		
	}
}
