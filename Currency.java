class Currency
{
String name;
CountryDetail country;
float value=1.0f;

Currency(String name)
{
      this.name=name;
	  this.value=value;
}

void displayDetails()
{
	System.out.println(this.name);
	System.out.println(this.country);
	System.out.println(this.value);
	
}
}