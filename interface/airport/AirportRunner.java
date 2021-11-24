package com.xworkz.interfacekeyword.airport;



public class AirportRunner {

	public static void main(String[] args) {
		AirportDTO airportDTOs=new AirportDTO("375", " Rajiv Gandhi International Airport ", "Hyderabad", "International");
		AirportDTO airportDTOs1=new AirportDTO("370", "Kempegouda International airport", "Bangalore", "International");
		AirportDTO airportDTOs2=new AirportDTO("356", "chennai International airport", "chennai", "International");
		
		

		AirportDAO airportDAORef=new ArrayAirportDAO();
		
		AirportAssociation association=new AirportAssociation(airportDAORef);
		
		association.saveDetails(airportDTOs);
		association.saveDetails(airportDTOs1);
		association.saveDetails(airportDTOs2);
		
		association.displayDetails();
		
		association.deleteAtIndex(2);
		association.displayDetails();
		
		association.updateDetails(3,airportDTOs2);
		association.displayDetails();

	}

}
