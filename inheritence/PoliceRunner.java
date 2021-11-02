package com.xworkz.deepavali;
import com.xworkz.deepavali.crime.*;
import  com.xworkz.deepavali.police.*;
public class PoliceRunner  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Police crimePolice=new CrimePolice();
	crimePolice.testMethod();
	
	Police trafficPolice=new TrafficPolice();
	trafficPolice.displayDetails();
	}

}
