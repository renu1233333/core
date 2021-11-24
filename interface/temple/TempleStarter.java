package com.xworkz.interfacekeyword.temple;

public class TempleStarter {

	public static void main(String[] args) {
		
		DevoteeRules devotees=new PublicDevoteesRules();
		
		TempleAssociation association=new TempleAssociation(devotees,"isckon");
		association.allowDevotees();
	}

}
