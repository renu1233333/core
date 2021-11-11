package com.xworkz.objectoverride;

import com.xworkz.objectoverride.constants.TyreType;

public class Tyre {

	
	private String brand;
	private float price;
	private TyreType type;
	
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setType(TyreType type) {
		this.type = type;
	}
	
	public String getBrand() {
		return brand;
	}
	public TyreType getType() {
		return type;
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
			return false;
		}
		
		if(obj instanceof Tyre)
		{
			Tyre tyreRef=(Tyre)obj;
			String brandRef=tyreRef.brand;
			TyreType typeRef=tyreRef.type;
			if(brand.equals(brandRef) && type.equals(typeRef))
			{
				return  true;
				
			}
		}
		return false;
	}
	
}
