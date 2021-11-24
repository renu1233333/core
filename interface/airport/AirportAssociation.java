package com.xworkz.interfacekeyword.airport;



public class AirportAssociation {

AirportDAO dao;
	
	
	
	public AirportAssociation(AirportDAO dao) {
		super();
		this.dao = dao;
	}



	void saveDetails(AirportDTO dtos)
	{
		System.out.println("invoked saveDetails");
		dao.save(dtos);
	}
	
	
	void displayDetails()
	{
		dao.display();
	}
	
	
	void deleteAtIndex(int index)
	{
		dao.delete(index);
	}
	
	void updateDetails(int index,AirportDTO dtos)
	{
		dao.update(index, dtos);
	}
}
