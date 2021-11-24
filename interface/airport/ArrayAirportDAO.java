package com.xworkz.interfacekeyword.airport;



public class ArrayAirportDAO implements AirportDAO{

	AirportDTO[] airportDTOs = new AirportDTO[10];
    int counter=0;
	@Override
	public boolean save(AirportDTO airportDTO) {
    if(airportDTO!=null && this.counter<airportDTOs.length)
    {
    	airportDTOs[this.counter++]=airportDTO;
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
  if(index>=0 && index<this.airportDTOs.length)
  {
	  airportDTOs[index]=null;
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
	public boolean update(int index, AirportDTO airportDTO) {
        if(index>=0 && index<this.airportDTOs.length && airportDTOs!=null)
        {
        	airportDTOs[index]=airportDTO;
        	System.out.println("updated at index "+index);
        	return true;
        }
        System.out.println("cannot update ");
		return false;
	}

	@Override
	public void display() {

		for(int i=0;i<airportDTOs.length;i++)
		{
			if(airportDTOs[i]!=null)
			{
				System.out.println(airportDTOs[i].getId());
				System.out.println(airportDTOs[i].getName());
				System.out.println(airportDTOs[i].getLocation());
				System.out.println(airportDTOs[i].getType());
			}
			else
			{
				System.err.println("pointing to null at index "+i);
			}
			
		}
		
	}

}
