package com.xworkz.casting;

import com.xworkz.casting.river.*;

public class TungabadraRiver extends River {

	public int noDams;

	public TungabadraRiver() {

		super();
		int noDams = 2;

		System.out.println(super.destination);
		System.out.println(this.noDams);
		System.out.println(noDams);
	}

	public void displayFlow() {
		River river = new River();// creating instance since River is public

//calling flowing method using inheritence since method is protected(cannot use reference)
		super.flowing();
	}

}
