class CompanyDetail
{
String name;
CountryDetail country;
String ceo;
String cfo;
CompanyDetail(String name,String ceo,String cfo)
{
this.name=name;
this.ceo=ceo;
this.cfo=cfo;
}

void displayDetails()
{
System.out.println(this.name);
System.out.println(this.country);
System.out.println(this.ceo);
System.out.println(this.cfo);
}
}