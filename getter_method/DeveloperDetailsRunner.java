class DeveloperDetailsRunner
{
public static void main(String[] gojju)
{
DeveloperDetails details=new DeveloperDetails();
details.setName("soumya");
details.setCompany("wipro");
details.setNumberOfExperience(6);
details.setSalary(40000);
String name=details.getName();
String company=details.getCompany();
int experience=details.getNumberOfExperience();
float salary=details.getSalary();
System.out.println(name);
System.out.println(company);
System.out.println(experience);
System.out.println(salary);



}
}