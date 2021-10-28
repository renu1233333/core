package com.xworkz.dp;

import com.xworkz.dao.*;
import com.xworkz.dto.*;

public class LawyerDTORunner {

	public static void main(String[] args) {
		LawyerDTO lawyerDtos = new LawyerDTO("keshav", "BBLLB", "criminal", 56, 304, 12, 76, "male");
		LawyerDTO lawyerDtos1 = new LawyerDTO("soumya", "BBLLB", "tax", 34, 200, 10, 45, "female");
		LawyerDTO lawyerDtos2 = new LawyerDTO("madhura", "BBLLB", "corporate", 12, 100, 7, 40, "female");
		LawyerDTO lawyerDtos3 = new LawyerDTO("sharan", "BBLLB", "civil rights", 59, 300, 11, 66, "male");
		LawyerDTO lawyerDtos4 = new LawyerDTO("kruti", "bbllb", "immigration", 57, 108, 12, 71, "female");
		LawyerDTO lawyerDtos5 = new LawyerDTO("prajwal", "BBLLB", "family", 34, 30, 0, 45, "male");
		LawyerDTO lawyerDtos6 = new LawyerDTO("sadananda", "BBLLB", "family", 59, 304, 12, 76, "male");
		LawyerDTO lawyerDtos7 = new LawyerDTO("manjula", "BBLLB", "criminal", 59, 300, 2, 66, "female");
		LawyerDTO lawyerDtos8 = new LawyerDTO("adhya", "BBLLB", "criminal", 36, 420, 0, 46, "female");
		LawyerDTO lawyerDtos9 = new LawyerDTO("spoorti", "BBLLB", "criminal", 59, 280, 22, 60, "female");

		LawyerDAO lawyerDAOs = new LawyerDAO();
		lawyerDAOs.save(lawyerDtos);
		lawyerDAOs.save(lawyerDtos1);

		lawyerDAOs.save(lawyerDtos2);
		lawyerDAOs.save(lawyerDtos3);

		lawyerDAOs.save(lawyerDtos4);
		lawyerDAOs.save(lawyerDtos5);

		lawyerDAOs.save(lawyerDtos6);
		lawyerDAOs.save(lawyerDtos7);

		lawyerDAOs.save(lawyerDtos8);

		lawyerDAOs.update(lawyerDtos9, 9);

		lawyerDAOs.delete(3);
		int number = lawyerDAOs.noOfindexOccupied();
		System.out.println("number of index occupied ".concat(String.valueOf(number)));

		lawyerDAOs.update(lawyerDtos3, 3);

		lawyerDAOs.display();

		boolean foundName = lawyerDAOs.searchByName("renu");
		System.out.println("name found " + foundName);

		boolean foundCaseWon = lawyerDAOs.searchByCaseWon(1);
		System.out.println(" found " + foundCaseWon);

		String name = "kruti";
		String qualification = lawyerDAOs.getQualificationByName(name);
		System.out.println("qaulification by name ".concat(String.valueOf(qualification)));

		String[] nameWithMaxExp = lawyerDAOs.getMaxExperience();
		// System.out.println("highest experience
		// ".concat(String.valueOf(maxExperience)));
		for (int xworkz = 0; xworkz < nameWithMaxExp.length; xworkz++) {
			if (nameWithMaxExp[xworkz] != null) {
				System.out.print(nameWithMaxExp[xworkz] + " ");
			}
		}
		System.out.println(" having same  maximum experience");
		
		
		

		String type = "criminal";
		String[] nameByType = lawyerDAOs.getNameByType(type);
        System.out.print("criminal lawyers: ");
		for (int xworkz = 0; xworkz < nameByType.length; xworkz++) {
			if (nameByType[xworkz] != null) {
				System.out.print(nameByType[xworkz] + " ");
			}
		}

		
		
		
		Integer experienceByName = lawyerDAOs.getExperienceByName("kruti");
		System.out.println("\n total experience " + experienceByName);

	}

}
