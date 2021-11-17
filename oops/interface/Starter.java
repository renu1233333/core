package com.xworkz.interfacekeyword;

public class Starter {

	public static void main(String[] args) {
		
		VotingRule rule1=new IndianCitizen();
		int age=rule1.validAge();
		System.out.println(age);
		String validId=rule1.validId();
		System.out.println(validId);
		TrafficRule rule2=new IndianCitizen();
		boolean insurenceResult=rule2.validInsurance();
		String licenceNo=rule2.licenceNo();
		boolean licenceResult=rule2.validLicence();
		
		
		MarriageRule rule3=new IndianCitizen();
		int ageRef=rule3.validAge();
		
		IndianCitizen rule4=new IndianCitizen();
		rule4.displayNameAndAdressDetails("renu",Address.KARNATAKA);
		
		VotingRule rule5=new IndianCitizen();
		
		System.out.println(rule5.equals(rule3));
		System.out.println(rule5.hashCode());
		
		Object obj=new IndianCitizen();
		System.out.println(obj.getClass());
		
		if(obj instanceof IndianCitizen)
		{
		    IndianCitizen ref=(IndianCitizen)obj;
		    System.out.println(ref.validInsurance());
		}
		
		MarriageRule rule6=new IndianCitizen();
		System.out.println(rule6.getClass());
		
         VotingRule rule7=new IndianCitizen();
         System.out.println(rule7.toString());
         
         TrafficRule rule8=new IndianCitizen();
         System.out.println(rule8.getClass());
         
         IndianCitizen rule9=new IndianCitizen();
         System.out.println(rule9.getClass());
         
         rule9.displayNameAndAdressDetails("smruti", null);
         
         
         
         
         //AfricanCitizen
         
         
         VotingRule rule10=new AfricaCitizen();
 		int ageRef1=rule10.validAge();
 		System.out.println(age);
 		String validIdRef=rule10.validId();
 		System.out.println(validId);
 		TrafficRule rule11=new IndianCitizen();
 		boolean insurenceResultRef=rule11.validInsurance();
 		String licenceNoRef=rule11.licenceNo();
 		boolean licenceResultRef=rule11.validLicence();
 		
 		
 		MarriageRule rule12=new AfricaCitizen();
 		int ageRefs=rule3.validAge();
 		
 		AfricaCitizen rule13=new AfricaCitizen();
 		rule4.displayNameAndAdressDetails("kruti",Address.ANDHRAPRADESH);
 		
 		VotingRule rule14=new AfricaCitizen();
 		
 		System.out.println(rule14.equals(rule3));
 		System.out.println(rule14.hashCode());
 		
 		Object objRefss=new AfricaCitizen();
 		System.out.println(objRefss.getClass());
 		
 		if(obj instanceof AfricaCitizen)
 		{
 			AfricaCitizen ref=(AfricaCitizen)obj;
 		    System.out.println(ref.validInsurance());
 		}
 		
 		MarriageRule rule15=new AfricaCitizen();
 		System.out.println(rule15.getClass());
 		
          VotingRule rule16=new AfricaCitizen();
          System.out.println(rule16.toString());
          
          TrafficRule rule17=new AfricaCitizen();
          System.out.println(rule17.getClass());
          
          AfricaCitizen rule18=new AfricaCitizen();
          System.out.println(rule18.getClass());
          
          rule18.displayDetails("shruti", null);
		
	}

}
