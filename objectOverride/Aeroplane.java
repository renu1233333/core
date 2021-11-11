package com.xworkz.objectoverride;

public  class Aeroplane extends Object{

	
	public String number;
	public String company;
	public String govt;
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	
	
	public void setGovt(String govt) {
		this.govt = govt;
	}
	
	public String getCompany() {
		return company;
	}
	
	public String getGovt() {
		return govt;
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
		
		if(obj ==null)
		{
			return false;
			
		}
		
		if(obj instanceof Aeroplane)
		{
			Aeroplane aeroplane=(Aeroplane)obj;
			String comapanyRef=aeroplane.company;
			String govtRef=aeroplane.govt;
			if(company.equals(comapanyRef) && govt.equals(govtRef))
			{
				return true;
			}
		}
		return false;
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("invoked finalize method");
		
	}
	
	
}
