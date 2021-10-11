class DeveloperDetails
{
private String name;
private String company;
private int numberOfExperience;
private float salary;
void setName(String name)
{
	this.name=name;
}

void setCompany(String company)
{
	this.company=company;
}
void setNumberOfExperience(int numberOfExperience)
{
	this.numberOfExperience=numberOfExperience;
}
void setSalary(float salary)
{
	this.salary=salary;
}
String getName()
{
	return this.name;
}
String getCompany()
{
	return this.company;
}
int getNumberOfExperience()
{
	return this.numberOfExperience;
}

float getSalary()

{
	return this.salary;
}
}