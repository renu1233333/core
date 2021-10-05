class LaboratoryRunner
{
public static void main(String[] puris)
{
String name="CSE Lab";
String location="1 floor btm";
int rooms=2;
String[] operatorName={"Renu","Raju","Varsha"};
Laboratory lab=new Laboratory(name,location,rooms,operatorName);

System.out.println(lab.name);
System.out.println(lab.location);
System.out.println(lab.noOfRooms);
System.out.println(lab.operatorName[0]);
System.out.println(lab.operatorName[1]);
System.out.println(lab.operatorName[2]);


}

}