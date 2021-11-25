package com.xworkz.exception.vehicle;

public class VehicleNumberOperatorRunner {

	public static void main(String[] args)throws VehicleNumberValidationException {
		VehicleNumberOperator numberRef=new VehicleNumberOperator();
		numberRef.create("KA03JJ9327");
		numberRef.create("TN76AZ1196");
		numberRef.create("HR26DQ1165");
		numberRef.create("KA41ER7654");
		numberRef.create("KL07CP7235");
		numberRef.create("KL09JJ5476");
		
	}

}
