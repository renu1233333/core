package com.xworkz.dao;

import com.xworkz.dto.*;

public class LawyerDAO {

	private LawyerDTO[] lawyerDtOs = new LawyerDTO[10];

	private String[] maxExperience = new String[10];

	private String[] nameByType = new String[10];

	private int counterExperience, counterType;
	private int maximum;
	private int counter;

	public void save(LawyerDTO ref) {
		if (ref != null) {
			this.lawyerDtOs[counter] = ref;
			System.out.println("stored at index ".concat(String.valueOf(this.counter)));
			this.counter++;
		}

		else {
			System.out.println("passed reference is null at index".concat(String.valueOf(this.counter)));
		}
	}
	
	
	
	

	public void display() {
		for (int paper = 0; paper < this.lawyerDtOs.length; paper++) {
			LawyerDTO ref = this.lawyerDtOs[paper];
			if (ref != null) {
				System.out.println("*********************************");
				System.out.println("index is ".concat(String.valueOf(paper)));
				System.out.println(ref.getName());
				System.out.println(ref.getQualification());
				System.out.println(ref.getType());
				System.out.println(ref.getNumberOfExperience());
				System.out.println(ref.getGender());
				System.out.println(ref.getAge());
				System.out.println(ref.getNoOfCasesWon());
				System.out.println(ref.getNoOfCaseLost());
				System.out.println("*********************************");
			} else {
				System.out.println("referencing to null at index".concat(String.valueOf(paper)));
			}
		}
	}

	
	
	public void delete(int index)

	{
		if (index >= 0 && index < this.lawyerDtOs.length) {
			if (this.lawyerDtOs[index] != null) {
				this.lawyerDtOs[index] = null;
				System.out.println("deleted at index ".concat(String.valueOf(index)));
				this.counter--;
			} else {
				System.out.println("Already pointing to null at index ".concat(String.valueOf(index)));
			}
		}

		else {
			System.out.println("Invalid index ".concat(String.valueOf(index)));
		}
	}

	
	
	public int noOfindexOccupied() {
		return this.counter;
	}

	
	
	
	public void update(LawyerDTO ref, int index) {
		if (index < this.lawyerDtOs.length && index >= 0 && ref != null) {
			this.lawyerDtOs[index] = ref;
			System.out.println("updated at index ".concat(String.valueOf(index)));
			this.counter++;
		} else {
			System.out.println("Either index is invalid or reference is null at index ".concat(String.valueOf(index)));
		}
	}
	
	
	

	public boolean searchByName(String name) {
		if (name != null) {
			for (int i = 0; i < this.lawyerDtOs.length; i++) {
				if (this.lawyerDtOs[i] != null) {

					if (this.lawyerDtOs[i].getName().equalsIgnoreCase(name)) {
						return true;
					}
				}
			}
		} else {
			System.out.println("passed name is null.cannot search");
		}
		return false;
	}

	
	
	public boolean searchByCaseWon(int noCaseWon) {
		if (noCaseWon >= 0) {
			for (int i = 0; i < this.lawyerDtOs.length; i++) {
				if (this.lawyerDtOs[i] != null) {

					if (String.valueOf(this.lawyerDtOs[i].getNoOfCasesWon()).equals(String.valueOf(noCaseWon))) {
						return true;
					}
				}
			}
		} else {
			System.out.println("passed number is invalid.cannot search");
		}
		return false;
	}

	
	
	public String getQualificationByName(String name) {
		for (int index = 0; index < this.lawyerDtOs.length; index++)

		{
			LawyerDTO ref = this.lawyerDtOs[index];
			if (ref != null) {
				String tempName = ref.getName();
				if (tempName.equalsIgnoreCase(name)) {
					return ref.getQualification();
				}
			}
		}

		return "No match";
	}

	
	
	public String[] getMaxExperience()

	{
		if (this.lawyerDtOs[0] != null) {
			maximum = this.lawyerDtOs[0].getNumberOfExperience();

			for (int biriyani = 1; biriyani < this.lawyerDtOs.length; biriyani++) {
				LawyerDTO ref = this.lawyerDtOs[biriyani];
				if (ref != null) {
					int exp = ref.getNumberOfExperience();
					if (exp >= maximum) {

						maximum = exp;

					}
				}

			}

		}
		System.out.print("maximum experience is " + maximum + " and ");
		for (int i = 0; i < this.lawyerDtOs.length; i++) {
			LawyerDTO ref = this.lawyerDtOs[i];
			if (ref != null) {
				if (String.valueOf(ref.getNumberOfExperience()).equals(String.valueOf(maximum))) {
					this.maxExperience[counterExperience++] = ref.getName();
				}

			}
		}

		return maxExperience;
	}

	
	
	
	
	public String[] getNameByType(String type) {
		for (int cid = 0; cid < this.lawyerDtOs.length; cid++) {
			LawyerDTO ref = this.lawyerDtOs[cid];
			if (ref != null) {
				String tempType = ref.getType();
				if (tempType.equalsIgnoreCase(type)) {
					this.nameByType[this.counterType++] = ref.getName();
				}
			}
		}

		return nameByType;
	}

	
	
	
	
	public Integer getExperienceByName(String name) {
		if (name != null) {
			for (int i = 0; i < this.lawyerDtOs.length; i++) {
				if (this.lawyerDtOs[i] != null) {
					if (this.lawyerDtOs[i].getName().equalsIgnoreCase(name)) {
						return this.lawyerDtOs[i].getNumberOfExperience();
					}
				}
			}
		}

		return null;
	}
	
	
}
