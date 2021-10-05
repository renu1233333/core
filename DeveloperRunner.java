class DeveloperRunner
{
public static void main(String[] develop)
{
String name="Hima";
String designation="Product Engineer";
float salary=60000.7f;
int experience=1;
DevelopersDetails details=new DevelopersDetails(name,designation,salary,experience);
System.out.println(details.name);
System.out.println(details.designation);
System.out.println(details.salary);
System.out.println(details.experience);
}
}