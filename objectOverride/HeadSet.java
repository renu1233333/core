package com.xworkz.objectoverride;

import com.xworkz.objectoverride.constants.HeadSetType;

public class HeadSet {

	private String name;
	private HeadSetType type;
	private float battery;
	private int warranty;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setType(HeadSetType type)
	{
		this.type=type;
	}
	
	public HeadSetType getType() {
		return type;
	}
	
	
	@Override
	public boolean equals(Object obj) {
	if(obj==null)
	{		
		System.out.println("you are passing null.check once again");
		return false;
	}
	if(obj instanceof HeadSet)
	{
	HeadSet setRef=(HeadSet)obj;
	String nameRef=setRef.getName();
	System.out.println(nameRef);
	HeadSetType iceRef=setRef.getType();
	
	
	
	if(this.name.equals(nameRef) && HeadSetType.WATERPROOF.equals(iceRef)) {
		System.out.println("matched");
		return true;
	}
	
	
	
	}
	return false;
	}
	
}
