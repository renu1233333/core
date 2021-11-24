package com.xworkz.interfacekeyword.airport;



public interface AirportDAO {

	boolean save(AirportDTO airportDTORef);
	boolean delete(int index);
	boolean update(int index,AirportDTO airportDTORef);
	void display();
}
