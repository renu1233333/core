package com.xworkz.fish;

public class GoldFish extends Fish{
public String color="orange";
public int sizeInInches=3;


public GoldFish() {
	this("red");
	System.out.println("Invoking no argument GoldFish constructor");
}

public GoldFish(String color)
{
	System.out.println("Invoking parametrized GoldFish constructor");
	this.color=color;
}
}
