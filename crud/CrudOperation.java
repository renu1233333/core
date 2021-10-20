package com.xworkz.crud.operation;

public class CrudOperation {

	private String[] chacolates = new String[5];
	private String[] gins = new String[5];
	private String[] restaurants = new String[5];
	private String[] resorts = new String[5];
	private String[] islands = new String[5];
	private String[] waterFalls = new String[5];
	private int counter = 0;
//chacolate
	
	public void addChacolates(String name) {
		System.out.println("passed arguments ".concat(name));
		if (this.counter < this.chacolates.length) {
			this.chacolates[this.counter] = name;
			this.counter++;
		} else {
			System.err.println("Chacolate Array is full.You cant add more");
		}
	}

	public void displayChacolates() {
		System.out.println("elements of chacolate ");
		for (int rain = 0; rain < this.chacolates.length; rain++) {
			System.out.println(chacolates[rain]);
		}
	}
//gin
	
	public void addGin(String name)
	{
		System.out.println("passed arguments ".concat(name));
		if (this.counter < this.gins.length) {
			this.gins[this.counter] = name;
			this.counter++;
		} else {
			System.err.println("Gin Array is full. You cant add more");
		}
	}

	public void displayGins() {
		System.out.println("elements of Gins ");
		for (int gin = 0; gin < this.gins.length; gin++) {
			System.out.println(gins[gin]);
		}
	}
//restaurant
	
	public void addRestaurant(String name) 
	{
		System.out.println("passed arguments ".concat(name));
		if (this.counter < this.restaurants.length) {
			this.restaurants[this.counter] = name;
			this.counter++;
		} else {
			System.err.println("Restaurant Array is full. You cant add more");
		}
	}

	public void displayRestaurant() 
	{
		System.out.println("elements of Restaurants");
		for (int chakli = 0; chakli < this.restaurants.length; chakli++) {
			System.out.println(restaurants[chakli]);
		}
	}

//resort
	
	public void addResort(String name)
	{
		System.out.println("passed arguments ".concat(name));
		if (this.counter < this.resorts.length) {
			this.resorts[this.counter] = name;
			this.counter++;
		} else {
			System.err.println("Resort Array is full. You cant add more");
		}
	}

	public void displayResort()
	{
		System.out.println("elements of Resort");
		for (int key = 0; key < this.resorts.length; key++) {
			System.out.println(resorts[key]);
		}
	}

//island
	
	public void addIsland(String name) 
	{
		System.out.println("passed arguments ".concat(name));
		if (this.counter < this.islands.length) {
			this.islands[this.counter] = name;
			this.counter++;
		} else {
			System.err.println("Island Array is full. You cant add more");
		}
	}

	public void displayIsland() 
	{
		System.out.println("elements of Island");
		for (int ice = 0; ice < this.islands.length; ice++) {
			System.out.println(islands[ice]);
		}
	}

//waterfalls
	
	public void addWaterFall(String name)
	{
		System.out.println("passed arguments ".concat(name));
		if (this.counter < this.waterFalls.length) {
			this.waterFalls[this.counter] = name;
			this.counter++;
		} else {
			System.err.println("WaterFall Array is full. You cant add more");
		}
	}

	public void displayWaterFall() 
	{
		System.out.println("elements of WaterFall");
		for (int falls = 0; falls < this.waterFalls.length; falls++)
		{
			System.out.println(waterFalls[falls]);
		}
	}

}
