package com.xworkz.interfacekeyword;

public class AmenityRules implements CompanyRule,HostelRules{

	
	@Override
	public int inTime() {
		System.out.println("override /implementation to inTime()");
		return 8;
		
	}
	
	
	
	
	@Override
	public int  inTiming() {
		System.out.println("override the ");
		return 9;
		
	}
	
}
