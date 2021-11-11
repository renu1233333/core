package com.xworkz.objectoverride;

public class City {

	
	private String name;
	private String stateName;
	private String countryName;
	
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getCountryName() {
		return countryName;
	}
	
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	
	public String getStateName() {
		return stateName;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	@Override
	public boolean equals(Object obj) {
		
		if(obj==null)
		{
			return false;
		}
		if(obj instanceof City)
		{
			City cityRef=(City)obj;
			String stateRef=cityRef.stateName;
			String countryRef=cityRef.countryName;
			if(stateName.equals(stateRef)&& countryRef.equals(countryRef))
			{
				return true;
			}
		}
		return false;
	}
}
