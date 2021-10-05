class IceCreamStarter
{public static void main(String[] sonepapadi)
{
IceCream cream=new IceCream(-5f,"venilla",Color.WHITE);
Brand brand1=cream.brand;
System.out.println(cream.temperature);
System.out.println(cream.type);
System.out.println(cream.flavour);
System.out.println(cream.color);
System.out.println(cream.brand);
System.out.println(brand1);


cream.brand=new Brand("naturals","varsha");
System.out.println(cream.brand);
//cream.brand=null;

Brand brand=cream.brand;
System.out.println(brand);
cream.brand=null;
System.out.println(cream.brand);
System.out.println(brand);
System.out.println(brand.name);
System.out.println(brand.ownerName);
System.out.println(brand.location);
System.out.println(brand.since);

brand.since=1998;
//brand.location="Bangalore";

System.out.println(brand.since);
//System.out.println(brand.location);





}
}