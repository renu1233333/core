package com.xworkz.interfacekeyword.bus;

public class ArrayBusRouterDAO implements BusRouterDAO {
	BusRouteDTO[] routerDTOs = new BusRouteDTO[10];
    int counter=0;
	@Override
	public boolean save(BusRouteDTO bus) {
    if(bus!=null && this.counter<routerDTOs.length)
    {
    	routerDTOs[this.counter++]=bus;
    	System.out.println("successfully saved ");
    	return true;
    	
    }
    else
    {
    	System.err.println("cannot save");
    }
		return false;
	}

	@Override
	public boolean delete(int index) {
  if(index>=0 && index<this.routerDTOs.length)
  {
	  routerDTOs[index]=null;
	  System.out.println("deleted at index "+index);
	  return true;
  }
  else
  {
	  System.err.println("cannot delete");
  }
	  return false;
	}

	@Override
	public boolean update(int index, BusRouteDTO busRef) {
        if(index>=0 && index<this.routerDTOs.length && busRef!=null)
        {
        	routerDTOs[index]=busRef;
        	System.out.println("updated at index "+index);
        	return true;
        }
        System.out.println("cannot update ");
		return false;
	}

	@Override
	public void display() {

		for(int i=0;i<routerDTOs.length;i++)
		{
			if(routerDTOs[i]!=null)
			{
				System.out.println(routerDTOs[i].getId());
				System.out.println(routerDTOs[i].getStartPoint());
				System.out.println(routerDTOs[i].getDestination());
				System.out.println(routerDTOs[i].getDriverName());
			}
			else
			{
				System.err.println("pointing to null at index "+i);
			}
			
		}
		
	}

}
