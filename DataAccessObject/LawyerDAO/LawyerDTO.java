package com.xworkz.dto;

public class LawyerDTO {

	private String name;
	private String qualification;
	private String type;
	private int numberOfExperience;
	private int noOfCasesWon;
	private int noOfCaseLost;
	private int age;
	private String gender;

	public LawyerDTO() {
		System.out.println("Invoking public no argument constructor");
	}

	public LawyerDTO(String name, String qualification, String type, int numberOfExperience, int noOfCasesWon,
			int noOfCaseLost, int age, String gender) {
		super();
		this.name = name;
		this.qualification = qualification;
		this.type = type;
		this.numberOfExperience = numberOfExperience;
		this.noOfCasesWon = noOfCasesWon;
		this.noOfCaseLost = noOfCaseLost;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNumberOfExperience() {
		return numberOfExperience;
	}

	public void setNumberOfExperience(int numberOfExperience) {
		this.numberOfExperience = numberOfExperience;
	}

	public int getNoOfCasesWon() {
		return noOfCasesWon;
	}

	public void setNoOfCasesWon(int noOfCasesWon) {
		this.noOfCasesWon = noOfCasesWon;
	}

	public int getNoOfCaseLost() {
		return noOfCaseLost;
	}

	public void setNoOfCaseLost(int noOfCaseLost) {
		this.noOfCaseLost = noOfCaseLost;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
