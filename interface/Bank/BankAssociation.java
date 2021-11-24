package com.xworkz.interfacekeyword.Bank;


public class BankAssociation {
BankDAO dao;
	
	
	
	public BankAssociation(BankDAO dao) {
		super();
		this.dao = dao;
	}



	void saveDetails(BankDTO dtos)
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
	
	void updateDetails(int index,BankDTO dtos)
	{
		dao.update(index, dtos);
	}
}
