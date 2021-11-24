package com.xworkz.interfacekeyword.bloodbank;

public class BloodBankDTO {

	private String name;
	private int age;
	private String bloodGroup;
	private boolean nonAlcoholic;

	public BloodBankDTO(String name, int age, String bloodGroup, boolean nonAlcoholic) {
		super();
		this.name = name;
		this.age = age;
		this.bloodGroup = bloodGroup;
		this.nonAlcoholic = nonAlcoholic;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public boolean isNonAlcoholic() {
		return nonAlcoholic;
	}

	public void setNonAlcoholic(boolean nonAlcoholic) {
		this.nonAlcoholic = nonAlcoholic;
	}

}
