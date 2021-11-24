package com.xworkz.interfacekeyword.bloodbank;

import com.xworkz.interfacekeyword.amazon.CartDTO;

public class BloodBank {
	BloodDonorDAO dao;

	public BloodBank(BloodDonorDAO dao) {
		super();
		this.dao = dao;
	}

	public void saveDetails(BloodBankDTO dto) {
		if (dto != null) {
			if (dto.isNonAlcoholic() == true && dto.getAge()>=18 && dto.getAge()<=65) {
				boolean found = dao.save(dto);
				if (found) {
					System.out.println("invoked save method in ArrayBloodDonorDAO");
				} else {
					System.err.println("not saved");
				}
			}

			else {
				System.out.println("not advisable to consume alcohol at least 24 hours before donate blood. and age should be between 18 and 65 ");
			}
		} else {
			System.err.println("passed null value");
		}
	}

	public void findDetailsByBloodGroupName(BloodBankDTO dto) {
		if (dto != null) {
			BloodBankDTO BloodGroupDTORef = dao.findByBloodGroup(dto.getBloodGroup());
			if (BloodGroupDTORef != null) {
				System.out.println(BloodGroupDTORef.getName());
				System.out.println(BloodGroupDTORef.getAge());
				System.out.println(BloodGroupDTORef.getBloodGroup());
				System.out.println(BloodGroupDTORef.isNonAlcoholic());
			} else {
				System.err.println("returning null  value");
			}

		} else {
			System.err.println("passed null reference");
		}

	}

	public void displayDetails() {
		if (dao != null) {
			dao.displayAllBloodDonorDetails();
		}
	}

}
