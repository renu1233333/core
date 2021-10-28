package com.xworkz.fish;

public class FishRunner {

	public static void main(String[] args) {
	com.xworkz.fish.SharkFish shark=new com.xworkz.fish.SharkFish();
    System.out.println(shark.alive);
    
    Fish shark1=new SharkFish();
   System.out.println( shark1.alive);

   GoldFish goldFish=new GoldFish();
   System.out.println(goldFish.color);
   
	}

}
