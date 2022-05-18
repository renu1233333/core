package Basics.constructor.parameterizedConstructor;

public class Circus {

	private int noOfPeople;
	private int noOfAnimals;
	private float ticketPrice;
	private int noOfHours;
	private int noOfShows;
	
	
	public Circus(int people,int animals,float price,int hours,int shows)
	{
		this.noOfPeople=people;
		this.noOfAnimals=animals;
		this.ticketPrice=price;
		this.noOfHours=hours;
		this.noOfShows=shows;
	}
	
	public void displayDetails()
	{  System.out.println("details of circus");
		System.out.println(this.noOfPeople);
		System.out.println(this.noOfAnimals);
		System.out.println(this.ticketPrice);
		System.out.println(this.noOfHours);
		System.out.println(this.noOfShows);
	}
}
