package com.xworkz.objectoverride;

import com.xworkz.objectoverride.constants.BeltMaterial;

public class Belt {

	private float price;
	private BeltMaterial material;
	private char gender;
	
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void setMaterial(BeltMaterial material) {
		this.material = material;
	}
	public BeltMaterial getMaterial() {
		return material;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==null)
		{
			System.out.println("passing null reference");
			return false;
		}
		
		if(obj instanceof Belt)
		{
			Belt beltRef=(Belt)obj;
			char genderRef=beltRef.gender;
			BeltMaterial beltMaterialRef=beltRef.material;
			Character charRef=Character.valueOf(gender);
			if(charRef.equals(gender)&& material.equals(beltMaterialRef))
			{
				System.out.println("matched");
				return true;
			}
		}
		return false;
	}
	
}
