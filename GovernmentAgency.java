class Person
{
String name;
long phoneNumber;
Person(String name,long phoneNumber)
{
	this(name,phoneNumber);
this.name=name;
this.phoneNumber=phoneNumber;


}
}

public class GovernmentAgency 
{
public static void main(String[] arg)
{
Person pass=new Person("Renu",8660120304l);
System.out.println(pass.name+" "+pass.phoneNumber);
}
}
