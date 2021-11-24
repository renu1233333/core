package com.xworkz.interfacekeyword.bloodbank;

public interface BloodDonorDAO {

	boolean save(BloodBankDTO bloodBankDTO);

	BloodBankDTO findByBloodGroup(String name);

	void displayAllBloodDonorDetails();
}
