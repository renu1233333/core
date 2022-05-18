package Basics.constructor.constructorChaining;

public class PatientHistoryRunner {
public static void main(String[] args)
{
//String name,String id,String bloodType,int age,char gender,String[] diagnose,String doctor,long phoneNumber,String address,boolean admitted	
	String[] diagnose={"anemic","typhoid"};
	PatientHistory patientRef1=new PatientHistory("krutika","3452g","B+",29,'f', diagnose,"Dr.Suchitra",9757465847L,"420 circle,xyz",true);
	
	System.out.println(diagnose);
	
	patientRef1.displayPatientDetails();
	
}
}
