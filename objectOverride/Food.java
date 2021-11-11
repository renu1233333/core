package com.xworkz.objectoverride;

public class Food {

	private String name;
	private float price;
	private float quantity;
	private boolean quality;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setQuality(boolean quality) {
		this.quality = quality;
	}
	
	public boolean isQuality() {
		return quality;
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
		if(obj instanceof Food)
		{  System.out.println();
			Food foodRef=(Food)obj;
			String nameRef=foodRef.name;
			boolean qualityRef=foodRef.quality;
			Boolean qualityReference=Boolean.valueOf(qualityRef);
			if(name.equals(nameRef)&& qualityReference.equals(quality))
              {
	                return true;
              }
		}
		
		return false;
	}
	
}
