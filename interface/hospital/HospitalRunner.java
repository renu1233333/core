package com.xworkz.interfacekeyword.hospital;

public class HospitalRunner {

	public static void main(String[] args) {
		HospitalAdmitRule hospitalAdmitRule=new PublicPatientRules();
		HospitalDischargeRule hospitalDischargeRule=new PublicPatientRules();
		
		Hospital hospitalRef=new Hospital("smruti hospital","bangalore",false,hospitalAdmitRule,hospitalDischargeRule);

		hospitalRef.admitPatient();
		hospitalRef.dischargePatient();
		
		
		
	}

}
