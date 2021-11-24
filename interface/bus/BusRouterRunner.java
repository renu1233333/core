package com.xworkz.interfacekeyword.bus;

public class BusRouterRunner {

	public static void main(String[] args) {
		BusRouteDTO busRouterDTOs=new BusRouteDTO("375", "kengeri", "banashankari", "hanuamanatppa");
		BusRouteDTO busRouterDTOs1=new BusRouteDTO("370", "rajajinagar", "chandapur", "govind");
		BusRouteDTO busRouterDTOs2=new BusRouteDTO("356", "banashankari", "kengeri", "nagappa");
		BusRouteDTO busRouterDTOs3=new BusRouteDTO("375", "kengeri", "banashankari", "hanuamanatppa");
		

		BusRouterDAO routerDAO=new ArrayBusRouterDAO();
		
		BusRouterAssociation association=new BusRouterAssociation(routerDAO);
		
		association.saveDetails(busRouterDTOs);
		association.saveDetails(busRouterDTOs1);
		association.saveDetails(busRouterDTOs2);
		association.saveDetails(busRouterDTOs3);
		association.displayDetails();
		
		association.deleteAtIndex(3);
		association.displayDetails();
		
		association.updateDetails(3,busRouterDTOs3);
		association.displayDetails();
		
	}

}
