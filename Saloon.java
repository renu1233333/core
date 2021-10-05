class Saloon

{
String name;
String location;
float openTime;
float closeTime;
SaloonBranch branch;

void hairCut()
{
System.out.println(name);
System.out.println(location);
System.out.println(openTime);
System.out.println(closeTime);
System.out.println(branch);
String bch=branch.loc;//error
System.out.println(bch);
System.out.println(branch.loc);
System.out.println("*********************");
}
}