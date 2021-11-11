package com.xworkz.objectoverride;

public class Stadium {

	private String name;
	private String city;
	private float areaInAcres;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj==null)
		{
			return false;
		}
		if(obj instanceof Stadium)
		{
		    Stadium stadium=(Stadium)obj;
		    String nameRef=stadium.name;
		    String cityRef=stadium.city;
		    if(name.equals(nameRef)&& city.equals(cityRef))
		    {
		    	return true;
		    }
		}
		return false;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	public String getCity() {
		return city;
	}
	
	
	
}
