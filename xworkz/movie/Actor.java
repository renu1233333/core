package com.xworkz.movie;

public class Actor {
	String actressName;
	void setName(String name)
	{
		this.actressName=name;
	}

	String getName()
	{
		System.out.println("from same package");
		return this.actressName;
	}
}
