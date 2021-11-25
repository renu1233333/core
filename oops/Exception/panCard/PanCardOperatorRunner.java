package com.xworkz.exception.panCard;

public class PanCardOperatorRunner {

	public static void main(String[] args)throws PanCardValidationException {
		PanCardOperator operatorRef=new PanCardOperator();
		operatorRef.save("AZUPH0596D");
		operatorRef.save("AXGTR8765F");
		operatorRef.save("AWLBF6575J");
		operatorRef.save("UGSFE2435D");
		operatorRef.save("AHADS5435J");
		operatorRef.save("NAYHG7634H");
		operatorRef.save("WBGTD9865U");

	}

}
