package com.xworkz.interfacekeyword;

public class RulesRunner {

	public static void main(String[] args) {
		AmenityRules rules1=new AmenityRules();
		rules1.inTime();
		
		CompanyRule rule2=new  AmenityRules();
		rule2.inTime();
		
		HostelRules rule3=new AmenityRules();
		rule3.inTiming();
		
		Object rule4=new AmenityRules();
		if(rule4 instanceof AmenityRules) {
			AmenityRules rule6=(AmenityRules)rule4;
			System.out.println(rule6.inTiming());
		}
		
		
		
		

	}

}
