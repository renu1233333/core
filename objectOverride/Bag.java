package com.xworkz.objectoverride;
import  com.xworkz.objectoverride.constants.*;
public class Bag {

public float price;
public BagColor color;
public int noOfSections;


   public void setPrice(float price) {
	this.price = price;
}
   
   public float getPrice() {
	return price;
}
   
   public void setColor(BagColor color) {
	this.color = color;
}
   
   public BagColor getColor() {
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
	  {  System.out.println("passed reference is null");
		  return false;
	  }
	
	  if(obj instanceof Bag)
	  {
		  Bag bagRef=(Bag)obj;
		  float priceRef=bagRef.price;
		  BagColor colorRef=bagRef.color;
		  Float autoboxingRef=Float.valueOf(priceRef);
		  System.out.println(autoboxingRef);
		  if(autoboxingRef.equals(price)&& color.WHITE.equals(colorRef))
		  {
			  System.out.println("matched");
			  return true;
		  }
		  
	  }
	  
		return false;
		
	}

}
