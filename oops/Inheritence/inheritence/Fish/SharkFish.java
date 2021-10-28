package com.xworkz.fish;

public class SharkFish extends Fish{
public int heightInFeet=14;
public float weightInKg=700.0f;
public boolean alive=false;

public SharkFish()
{  this(800.3f);
	System.out.println("invoking no argument SharkFish constructor");
}

public SharkFish(float weight)
{
   super();
   System.out.println("Invoking ");
}
}