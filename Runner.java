class Runner
{public static void main(String[] val)
{
String[] favouriteName={"Renu","Tata Safari","samsung"};
String[] companyNames={"oracle","Google","SAP Labs","Music Broadcast Ltd.","samsung",
"capgemini"};
String[] computerBrands={"Lenovo","HP","Apple","Acer","Dell","Asus"};
String[] mobileBrands={"Apple","Oppo","Xiaomi","OnePlus","samsung"};
String[] iplTeams={"RCB","Chennai Super Kings","Mumbai Indians","Rajastan Royals","Delhi Capitals","Punjab Kings"};
String dreamCompany=MethodUsage.printName(favouriteName);
System.out.println("Dream Company: "+dreamCompany);
MethodUsage.printCompany(companyNames);
MethodUsage.printComputer(computerBrands);
String mobileName=MethodUsage.printMobile(mobileBrands);
System.out.println("Mobile Brand: "+mobileName);
String iplName=MethodUsage.printIpl(iplTeams);
System.out.println("ipl Team: "+iplName);
}
}