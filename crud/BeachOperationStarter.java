package com.xworkz.crud.operation;

public class BeachOperationStarter {
	private String country;
	private String[] beachNames = new String[4];
	private int counter = 0;

	public BeachOperationStarter() {
		this("India");
		System.out.println("Invoked public default constructor");

	}

	public BeachOperationStarter(String name) {
		System.out.println("invoked public parameterized constructor");
		this.country = name;

	}

	public String getCountry() {

		return this.country;
	}

	public void addBeach(String name) {
		System.out.println("name argument ".concat(name));
		if (counter < beachNames.length) {
			System.out.println("Invoked addBeach");
			this.beachNames[counter] = name;
			this.counter++;
		} else {
			System.err.println("array is full");
		}
	}

	public void displayBeach() {
		for (int xworkz = 0; xworkz < beachNames.length; xworkz++) {
			System.out.println(beachNames[xworkz]);
		}
	}
}
