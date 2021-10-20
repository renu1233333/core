package com.xworkz.crud;
import com.xworkz.crud.operation.*;

public class CrudStarter {

	public static void main(String[] args) {
				
		CrudOperation chacolate=new CrudOperation();
		System.out.println("***Invoking chacolate***");
		chacolate.addChacolates("dairy milk");
		chacolate.addChacolates("munch");
		chacolate.addChacolates("kitkat");
		chacolate.addChacolates("milki bar");
		chacolate.addChacolates("five star");
		chacolate.addChacolates("perk");
		chacolate.displayChacolates();
		
		CrudOperation gin=new CrudOperation();
		System.out.println("***Invoking gin***");
		gin.addGin("aviation gin");
		gin.addGin("monkey 47 dry gin");
		gin.addGin("fords gin");
		gin.addGin("gray whale gin");
		gin.addGin("bar hill gin");
		gin.addGin("plymouth gin");
		
		gin.displayGins();
		
		CrudOperation restaurant=new CrudOperation();
		System.out.println("***Invoking restaurant***");
		restaurant.addRestaurant("maiyas restaurant");
		restaurant.addRestaurant("gonative");
		restaurant.addRestaurant("Samrajya restaurant");
		restaurant.addRestaurant("onest");
		restaurant.addRestaurant("URU Brewpark");
		restaurant.addRestaurant("Tandoor Dum");
		
		restaurant.displayRestaurant();
		
		CrudOperation resort=new CrudOperation();
		System.out.println("***Invoking resort***");
		resort.addResort("woodrose");
		resort.addResort("Royal Orchid Resort & Convention Centre");
		resort.addResort("Palm Meadows Club");
		resort.addResort("Wonderla Resort");
		
		resort.addResort("Signature Club Resort");
		resort.addResort("Goldfinch Retreat Bangalore");
		
		resort.displayResort();
		
		CrudOperation island=new CrudOperation();
		System.out.println("***Invoking island***");
		island.addIsland("Guafo Island");
		island.addIsland("Maldives");
		island.addIsland("Palawan");
		island.addIsland("Santorini");
		island.addIsland("Bali");
		island.addIsland("Dalmatian");
		island.displayIsland();
		
		CrudOperation waterFall=new CrudOperation();
		System.out.println("***Invoking waterFall***");
		waterFall.addWaterFall("dudhsagar waterfalls");
		waterFall.addWaterFall("hebbe waterfalls");
		waterFall.addWaterFall("magod waterfalls");
		waterFall.addWaterFall("abbi waterfalls");
		waterFall.addWaterFall("sathodi waterfalls");
		waterFall.addWaterFall("gokak waterfalls");
		
		waterFall.displayWaterFall();
	
	}

}
