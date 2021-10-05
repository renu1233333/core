class Jail
{
String name;
String location;
int numberOfCriminals=150;
int personnel=50;
float areaInAcres=4;
int yearOfConstruction;
boolean strict;
Jail()
{
}

Jail(String name,String location,int yearOfConstruction)
{  System.out.println("*************************************");
	System.out.println("passed String,String,int");
this.name=name;
this.location=location;
this.yearOfConstruction=yearOfConstruction;
}

Jail(String name,String location,int yearOfConstruction,int numberOfCriminals,int personnel)
{
	System.out.println("*************************************");
System.out.println("passed string string int int int");
this.name=name;
this.location=location;
this.yearOfConstruction=yearOfConstruction;
this.numberOfCriminals=numberOfCriminals;
this.personnel=personnel;

}


}