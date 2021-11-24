package com.xworkz.interfacekeyword.hospital;

public class PublicPatientRules implements HospitalAdmitRule,HospitalDischargeRule {

	@Override
	public String register() {
		System.out.println("invoked register method");
		return "registered";
	}
	
	@Override
	public double payAdvance() {
		System.out.println("invoked payAdvance method");
		return 0.0;
	}
	@Override
	public boolean validInsurance() {
		System.out.println("invoked validInsurance method");
		return true;
	}
	@Override
	public boolean payBill() {
		System.out.println("invoked payBill method");
		return true;
	}
	@Override
	public double discount() {
		System.out.println("invoked discount method");
		return 10;
	}
	
}
