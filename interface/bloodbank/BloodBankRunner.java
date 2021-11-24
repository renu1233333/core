package com.xworkz.interfacekeyword.bloodbank;

public class BloodBankRunner {

	public static void main(String[] args) {
		BloodBankDTO dtoRef = new BloodBankDTO("sudeep", 30, "A+", true);

		BloodDonorDAO daoRef = new ArrayBloodDonorDAO();

		BloodBank bloodBankRef = new BloodBank(daoRef);
		bloodBankRef.saveDetails(dtoRef);
		bloodBankRef.findDetailsByBloodGroupName(dtoRef);
		bloodBankRef.displayDetails();

	}

}
