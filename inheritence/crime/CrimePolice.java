package com.xworkz.deepavali.crime;
import com.xworkz.deepavali.police.*;
public class CrimePolice extends Police{

	public CrimePolice()
	{   super();
		System.out.println("Invoking no arg const of CrimePolice");
		System.out.println();
	}
	
	
	public void testMethod()
	{
		System.out.println("invoking testMethod from CrimePolice");
		super.displayDetails();
		
	}
	
}
