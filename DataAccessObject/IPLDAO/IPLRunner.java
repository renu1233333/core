package com.xworkz.dp;

import com.xworkz.dao.IPLDAO;
import com.xworkz.dto.*;

public class IPLRunner {
	public static void main(String[] args) {
		IPLDTO iplDtos = new IPLDTO("RCB", 3, "USL");
		IPLDTO iplDtos1 = new IPLDTO("MI", 6, "ambani");

		IPLDAO iplDAOs = new IPLDAO();
		IPLDAO iplDAOs1 = new IPLDAO();

		iplDAOs1.create(iplDtos1);

		iplDAOs.create(iplDtos);
		iplDAOs.create(iplDtos1);

		iplDAOs.display();

		int numberOfIndex = iplDAOs.indexOccupied();
		System.out.println("Total number of index".concat(String.valueOf(numberOfIndex)));

		iplDAOs.createByIndex(new IPLDTO("KKR", 4, "sharuk khan"), 34);

		numberOfIndex = iplDAOs.indexOccupied();
		System.out.println("Total number of index".concat(String.valueOf(numberOfIndex)));

		iplDAOs.display();

		numberOfIndex = iplDAOs.indexOccupied();
		System.out.println("Total number of index".concat(String.valueOf(numberOfIndex)));

		iplDAOs.delete(0);

		numberOfIndex = iplDAOs.indexOccupied();
		System.out.println("Total number of index".concat(String.valueOf(numberOfIndex)));

		boolean find = iplDAOs.matchByName("MI");
		System.out.println("name is matched ".concat(String.valueOf(find)));

		boolean duplicate = iplDAOs.findDuplicate(iplDtos1.getTeamName());
		System.out.println("names of the two instance is ".concat(String.valueOf(duplicate)));

	}
}
