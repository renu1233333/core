class IceCream
{
String flavour;
String type="cone";
float temperature;
Color color;
Brand brand;

IceCream(float temp)
{
	this.temperature=temp;
}
IceCream(float temp,String flavour,Color color)
{
	this(temp);
	this.flavour=flavour;
	this.color=color;
}
}