class Grinder
{
float capacity=16;
String company="Butterfly Smart";

Motor motor=new Motor("RJ",8500);


Grinder(float capacity,String company)
{
	this.capacity=capacity;
	this.company=company;
}
}