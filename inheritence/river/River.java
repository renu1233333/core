package com.xworkz.casting.river;

public class River {

	public String name;
	public String origin;
	public float length;
	public String destination;

	public River() {
		System.out.println("only classes within same  package and different package are  accessing  River const");
	}

	protected void flowing() {
		System.out.println("invoking flowing method");

	}

}
