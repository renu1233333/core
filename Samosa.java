class Samosa
{
float price;
SamosaSize size;
boolean taste;
String[] ingredients;

Samosa()
{
	
}

Samosa(float price,boolean taste)
{
	this.price=price;
	this.taste=taste;
	return;
}
Samosa(SamosaSize size,String[] ingredients)
{
	this.size=size;
	this.ingredients=ingredients;
}
Samosa(float price,boolean taste,SamosaSize size,String[] ingredients)
{
	//this(price,taste);
	this(size,ingredients);
	this.price=price;
	this.taste=taste;
}
void getMessage()
{
String name=" ";
System.out.println(name);	
}

}