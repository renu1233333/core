package Basics.constructor.constructorChaining;

public class PatientHistory {
    private String patientName;
	private String hospitalId;
	private String bloodType;
	private int age;
	private char gender;
	private String[] diagnosis;
	private String consultantDoctor;
	private long phoneNumber;
	private String address;
	private boolean admitted;
	
	public PatientHistory(String name,String id,String bloodType,int age,char gender,String[] diagnose,String doctor,long phoneNumber,String address,boolean admitted) {
		this(bloodType,age,gender,diagnose,doctor,phoneNumber,address,admitted);
		this.patientName=name;
		this.hospitalId=id;
		
	}
	
	public PatientHistory(String bloodType,int age,char gender,String[] diagnose,String doctor,long phoneNumber,String address,boolean admitted)
	{
		this(gender,diagnose, doctor, phoneNumber, address, admitted);
		this.bloodType=bloodType;
		this.age=age;
		
	}
	public PatientHistory(char gender,String[] diagnose,String doctor,long phoneNumber,String address,boolean admitted)
	{
		this(diagnose);
		this.gender=gender;
		this.consultantDoctor=doctor;
		this.phoneNumber=phoneNumber;
		this.address=address;
		this.admitted=admitted;
	}
	public PatientHistory(String[] diagnose)
	{
		this.diagnosis=diagnose;
	}
	
	public void displayPatientDetails()
	{
		System.out.println(this.patientName);
		System.out.println(this.hospitalId);
		System.out.println(this.age);
		System.out.println(this.bloodType);
		
		System.out.println(this.gender);
		System.out.println(this.address);
		System.out.println(this.phoneNumber);
		System.out.println(this.consultantDoctor);
		
		if(this.diagnosis!=null)
		{
			for(int reported=0;reported<this.diagnosis.length;reported++)
			{
				System.out.print(diagnosis[reported]+",");
			}
		}
		else
		{
			System.err.println("null for diagnosis");
		}
		
		
	}
	
}
