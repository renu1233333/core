package com.xworkz.interfacekeyword.bus;

public class BusRouterAssociation {

	BusRouterDAO dao;
	
	
	
	public BusRouterAssociation(BusRouterDAO dao) {
		super();
		this.dao = dao;
	}



	void saveDetails(BusRouteDTO dtos)
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
	
	void updateDetails(int index,BusRouteDTO dtos)
	{
		dao.update(index, dtos);
	}
}
