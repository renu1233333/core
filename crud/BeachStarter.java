package com.xworkz.crud;
import com.xworkz.crud.operation.*;
public class BeachStarter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeachOperationStarter beachOpeartor = new BeachOperationStarter();
		String country = beachOpeartor.getCountry();
		System.out.println(country);

		beachOpeartor.addBeach("malpe beach");
		beachOpeartor.addBeach("karwar beach");
		beachOpeartor.addBeach("baga beach");
		beachOpeartor.addBeach("om beach");
		beachOpeartor.addBeach("beach");
		beachOpeartor.displayBeach();
	}
}
