package com.xworkz.interfacekeyword.bird;

public class BirdSantuary {
BirdDAO dao;



public BirdSantuary(BirdDAO dao) {
	super();
	this.dao = dao;
}



void saveBirdDetails(BirdDTO dto)
{
	if(dto!=null)
	{
		boolean result=dao.save(dto);
		System.out.println(result);
	
	}
	else
	{
		System.out.println("You have passed null..please send proper values");
	}
}


void deleteDetails(int index)
{
	boolean deletedFound=dao.delete(index);
	System.out.println(deletedFound);
}
void updateDetails(int index,BirdDTO dto)
{
	int updatedIndex=dao.update(index, dto);
	System.out.println(updatedIndex);
}

void displayDetails()
{
	dao.displayDetails();
}

}
