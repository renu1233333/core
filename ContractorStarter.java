  class ContractorStarter
  {
	  public static void main(String[] args)
	  {
		  Contractor contractor=new Contractor();
		  
		  String name=contractor.getName();
		  System.out.println("CONTRACTOR NAME="+name);
		  
		  int age=contractor.getAge();
		  System.out.println("AGE IS="+age);
		  
		  float since=contractor.getSince();
		  System.out.println("SINCE="+since);
		  
		  String experience=contractor.getExperience();
		  System.out.println("EXPERIENCE="+experience);
		  
		  String location=contractor.getLocation();
		  System.out.println("LOCATION="+location);
		  
		  String qualification=contractor.getQualification();
		  System.out.println("QUALIFICATION="+qualification);
		  
	  
  
  contractor.setName("PRAGNA");
  String name1=contractor.getName();
  System.out.println("NEW NAME="+name1);
   
   contractor.setAge(54);
   int age1=contractor.getAge();
   System.out.println("NEW AGE="+age1);
   
   contractor.setSince(1875);
   float since1=contractor.getSince();
   System.out.println("SINCE="+since1);
   
   contractor.setExperience("6 years");
   String experience1=contractor.getExperience();
   System.out.println("EXPERIENCE="+experience1);
   
   contractor.setLocation("CHENNAI");
   String location1=contractor.getLocation();
   System.out.println("LOCATION="+location1);
   
   contractor.setQualification("MASTER");
   String qualification1=contractor.getQualification();
   System.out.println("QUALIFICATION="+qualification1);
	  }
  }