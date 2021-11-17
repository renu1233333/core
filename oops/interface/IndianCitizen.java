package com.xworkz.interfacekeyword;

public class IndianCitizen implements VotingRule,TrafficRule,MarriageRule{
	private String name;
	private Address adress;
	
	public void displayNameAndAdressDetails(String name,Address adress)
	{ this.name=name;
	this.adress=adress;
		System.out.println(this.name);
		System.out.println(this.adress);
		
	}

	
	public void setAdress(Address adress) {
		this.adress = adress;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	

@Override
public int validAge() {
	return 78;
	// TODO Auto-generated method stub
	
}

@Override
public String validId() {
	// TODO Auto-generated method stub
	return "xworkz";
}
@Override
public boolean validLicence() {
	// TODO Auto-generated method stub
	return false;
}
@Override
public String licenceNo() {
	// TODO Auto-generated method stub
	return null;
}
@Override
public boolean validInsurance() {
	// TODO Auto-generated method stub
	return false;
}
	
	
}
