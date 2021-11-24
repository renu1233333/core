package com.xworkz.interfacekeyword.bus;

public interface BusRouterDAO {

	boolean save(BusRouteDTO bus);
	boolean delete(int index);
	boolean update(int index,BusRouteDTO busRef);
	void display();
	
}
