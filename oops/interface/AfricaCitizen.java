package com.xworkz.interfacekeyword;

public class AfricaCitizen implements VotingRule,MarriageRule,TrafficRule{
	
	private String name;
	private String StateName;
	public void displayDetails(String name,String stateName)
	{
		this.name=name;
		this.StateName=StateName;
		System.out.println(this.name);
		System.out.println(this.StateName);
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
