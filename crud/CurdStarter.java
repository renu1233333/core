package com.xworkz.crud;

import com.xworkz.crud.operation.CurdOperation;


public class CurdStarter {

	public static void main(String[] args) {
		CurdOperation labour=new CurdOperation();
		labour.addLabour("renu");
		labour.addLabour("asma");
		labour.addLabour("sanjay");
		labour.addLabour("mukta");
		labour.addLabour("nikita");
		
		System.out.println("displaying labours");
		labour.displayLabour();
		
		labour.deleteLabour(2);
          labour.updateLabour(3, "reshma");	
          System.out.println("displaying labours");
  		labour.displayLabour();

  		
  		
  		CurdOperation cofee=new CurdOperation();
		cofee.addCofee("Espresso");
		cofee.addCofee("Cappuccino");
		cofee.addCofee("Robusta");
		cofee.addCofee("Black Coffee");
		cofee.addCofee("Decaf");
		
		System.out.println("displaying cofee");
		cofee.displayCofee();
		
		cofee.deleteCofee(3);
		cofee.updateCofee(4, "Double Espresso");	
          System.out.println("displaying coffee");
          cofee.displayCofee();
          
          
          
          CurdOperation airport=new CurdOperation();
          airport.addAirport("Indira Gandhi International Airport");
          airport.addAirport("Goa International Airport");
          airport.addAirport("Sardar Vallabhbhai Patel International Airport");
          airport.addAirport("Chennai International Airport");
          airport.addAirport("Netaji Subhash Chandra Bose International Airport");
  		
  		System.out.println("displaying airport");
  		airport.displayAirport();
  		
  		airport.deleteAirport(3);
  		airport.updateAirport(1, "Veer Savarkar International Airport");	
            System.out.println("displaying Airport");
            airport.displayAirport();
            
            CurdOperation stadium=new CurdOperation();
            stadium.addStadium("Narendra Modi Stadium");
            stadium.addStadium("Visvesvaraya Stadium");
            stadium.addStadium("Tilak Maidan Stadium");
            stadium.addStadium("Sree Kanteerava Stadium");
            stadium.addStadium("Rajiv Gandhi International Stadium");
    		
    		System.out.println("displaying stadium");
    		stadium.displayStadium();
    		
    		stadium.deleteStadium(0);
    		stadium.updateStadium(2, "Rajendra Stadium");	
              System.out.println("displaying stadium");
              stadium.displayStadium();
               
            
	}

}
