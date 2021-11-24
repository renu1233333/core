package com.xworkz.interfacekeyword.bloodbank;

import com.xworkz.interfacekeyword.amazon.CartDTO;

public class ArrayBloodDonorDAO implements BloodDonorDAO {
	private BloodBankDTO[] dtos = new BloodBankDTO[10];
	int counter = 0;

	@Override
	public boolean save(BloodBankDTO bloodBankDTO) {

		System.out.println("invoked save method");
		if (bloodBankDTO != null && counter < dtos.length) {
			dtos[counter++] = bloodBankDTO;
			return true;
		}
		return false;
	}

	@Override
	public BloodBankDTO findByBloodGroup(String name) {
		System.out.println("invoked findByBloodGroup");
		if (name != null) {
			for (int i = 0; i < dtos.length; i++) {
				BloodBankDTO dtoRef = dtos[i];
				if (dtoRef != null) {

					String nameRef = dtoRef.getBloodGroup();

					if (name.equalsIgnoreCase(nameRef)) {
						return dtoRef;
					}

				} else {
					System.out.println("null reference at index ".concat(String.valueOf(i)));
				}
			}
		}
		return null;
	}

	@Override
	public void displayAllBloodDonorDetails() {
		System.out.println("invoked displayAllBloodDonorDetails method");

		for (int i = 0; i < dtos.length; i++) {
			BloodBankDTO dtoRef = dtos[i];
			if (dtoRef != null) {
				System.out.println("Donor Name: "+dtoRef.getName());
				System.out.println("Donor Age: "+dtoRef.getAge());
				System.out.println("Donor BloodGroup: "+dtoRef.getBloodGroup());
				System.out.println("Donor is non alcoholic: "+dtoRef.isNonAlcoholic());
			} else {
				System.out.println("null at the index ".concat(String.valueOf(i)));
			}
		}

	}

}
