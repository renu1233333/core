class Weapon
{
String size;
float cartridge;
String name;
String country;
int year;
String material;
Weapon()
{
System.out.println("Invoking Default Constructor");
}
Weapon(String name,String size,float cartridge,String country,int year,String material)
{System.out.println(" Constructor overloading");
this.name=name;
this.size=size;
this.cartridge=cartridge;
this.country=country;
this.year=year;
this.material=material;
}

Weapon(String name,String size,float cartridge,String country,int year)
{
	System.out.println(" Constructor overloading");
this.name=name;
this.size=size;
this.cartridge=cartridge;
this.country=country;
this.year=year;
}

Weapon(String name,String size,float cartridge,String country)
{
	System.out.println(" Constructor overloading");
this.name=name;
this.size=size;
this.cartridge=cartridge;
this.country=country;
}

Weapon(String name,String size,float cartridge)
{
	System.out.println(" Constructor overloading");
this.name=name;
this.size=size;
this.cartridge=cartridge;
}

Weapon(String name,String size)
{
	System.out.println(" Constructor overloading");
this.name=name;
this.size=size;

}
Weapon(String name)
{
	System.out.println(" Constructor overloading");
this.name=name;

}


Weapon(String name,float cartridge,String country,int year)
{
	System.out.println(" Constructor overloading");
this.name=name;

this.cartridge=cartridge;
this.country=country;
this.year=year;

}


Weapon(String name,String country,int year)
{
	System.out.println(" Constructor overloading");
this.name=name;


this.country=country;
this.year=year;

}

Weapon(String name,int year)
{
	System.out.println(" Constructor overloading");
this.name=name;

this.year=year;

}




Weapon(float cartridge,String country,int year)
{
System.out.println(" Constructor overloading");
this.cartridge=cartridge;
this.country=country;
this.year=year;

}

Weapon(String name,float cartridge)
{
	System.out.println(" Constructor overloading");
this.name=name;

this.cartridge=cartridge;

}
}