package com.xworkz.objectoverride;

import com.xworkz.objectoverride.constants.FishType;

public class Fish {

	private String name;
	private float price;
	private String color;
	private FishType type;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
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
			return true;
			
		}
		if(obj instanceof Fish)
		{
			Fish fishRef=(Fish)obj;
			String nameRef=fishRef.name;
			String colorRef=fishRef.color;
			if(name.equals(nameRef)&& color.equals(colorRef))
			{
				return true;
			}
		}
		return false;
	}
	
}
