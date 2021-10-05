class CountryDetail
{
String name;
int countryCode;

CountryDetail()
{
	
}
CountryDetail(String name,int countryCode)
{
this.name=name;
this.countryCode=countryCode;
}

void displayDetails()
{
	System.out.println(this.name);
	System.out.println(this.countryCode);
}
}