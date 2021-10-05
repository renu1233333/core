class CurrencyRunner
{
	public static void main(String[] naginis)
	{
		Currency currency=new Currency("Rupees");
		currency.displayDetails();
		currency=new Currency("dollor")
		currency.value=0.18f;
		//System.out.println(currency);
		currency.displayDetails();
		currency.country=new CountryDetail("India",91);
		System.out.println(currency.country);
		CountryDetail country=currency.country;
		country.displayDetails();
		Application application=new Application("java",16.2f);
		application.displayDetails();
		application.company=new CompanyDetail("oracle","safra catz","kanwar singh");
		CompanyDetail company=application.company;
		company.displayDetails();
		company.country=new CountryDetail();
		CountryDetail country1=company.country;
		country1.displayDetails();
		}
}