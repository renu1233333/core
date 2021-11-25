package com.xworkz.exception;

public class EmailOperatorRunner {

	public static void main(String[] args) throws EmailValidationException{
		
		EmailOperator emailOperatorRef=new EmailOperator();
		emailOperatorRef.save("renu.xworkz@gmail.com");
		emailOperatorRef.save("varsha@gmail.com");
		emailOperatorRef.save("sruti@gmail.com");
		emailOperatorRef.save("pooja@gmail.com");
		emailOperatorRef.save("anusha@gmail.com");
		emailOperatorRef.save("ambika@gmail.com");
	}

}
