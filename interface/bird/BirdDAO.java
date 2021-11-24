package com.xworkz.interfacekeyword.bird;

public interface BirdDAO {

	boolean save(BirdDTO birdDTOs);
	boolean delete(int index);
	int update(int index,BirdDTO birdDTOs);
	void displayDetails();
	
	
}
