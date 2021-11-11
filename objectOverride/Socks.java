package com.xworkz.objectoverride;

import com.xworkz.objectoverride.constants.BagColor;
import com.xworkz.objectoverride.constants.SocksMaterial;

public class Socks {

	
	private float price;
	private char size;
	private SocksMaterial material;
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	public void setMaterial(SocksMaterial material) {
		this.material = material;
	}
	
	public float getPrice() {
		return price;
	}
	
	public SocksMaterial getMaterial() {
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
		  {  System.out.println("passed reference is null");
			  return false;
		  }
		
		  if(obj instanceof Socks)
		  {
			  Socks socksRef=(Socks)obj;
			  float priceRef=socksRef.price;
			  SocksMaterial materialRef=socksRef.material;
			  Float autoboxingRef=Float.valueOf(priceRef);
			  System.out.println(autoboxingRef);
			  if(autoboxingRef.equals(price)&& material.COTTON.equals(materialRef))
			  {
				  System.out.println("matched");
				  return true;
			  }
			  
		  }
		  
			return false;
		
	}
}
