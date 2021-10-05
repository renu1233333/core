class JailRunner
{
public static void main(String[] escape)

{
String name="Centarl Jail";
String location="Bangalore";
int yearOfConst=1877;
Jail jail=new Jail(name,location,yearOfConst);
System.out.println(jail.name);
System.out.println(jail.location);
System.out.println(jail.numberOfCriminals);
System.out.println(jail.personnel);
System.out.println(jail.areaInAcres);
System.out.println(jail.yearOfConstruction);
System.out.println(jail.strict);



int numberOfCriminals=200;
int personnel=100;
name="Ballry Jail";
location="Ballary";
yearOfConst=1872;

Jail jail1=new Jail( name, location,yearOfConst,numberOfCriminals,personnel);
System.out.println(jail1.name);
System.out.println(jail1.location);
System.out.println(jail1.numberOfCriminals);
System.out.println(jail1.personnel);
System.out.println(jail1.areaInAcres);
System.out.println(jail1.yearOfConstruction);
System.out.println(jail1.strict);




}}