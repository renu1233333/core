class HospitalRunner
{
public static void main(String[] treatment)
{
	String name="Harsha Hospital";
	String place="JP Nagar";
	String owner="Mr.Adarsha";
	int numberOfBeds=400;
Hospitals cure=new Hospitals(name,place,owner,numberOfBeds);
System.out.println(cure.name+"\n"+cure.place+"\n"+cure.owner+"\n"+cure.numberOfBeds);
}
}