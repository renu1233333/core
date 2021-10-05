class Helmet
{
String color;
float price;
String brand;
HelmetSize size;

void wear()
{
	System.out.println(color);
	System.out.println(price);
	System.out.println(brand);
	System.out.println(size);
	System.out.println("*******");
}

void protect()
{
	System.out.println("Invoking protect method");
	System.out.println(color);
	System.out.println(price);
	System.out.println(brand);
	System.out.println(size);
	System.out.println("*******");
}
}