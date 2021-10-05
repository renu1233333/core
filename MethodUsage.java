class MethodUsage{
public static String printName(String favouriteName[]){
System.out.println(favouriteName[0]+" "+favouriteName[1]);
return favouriteName[2];

}
public static void printCompany(String companyNames[]){
System.out.println("\nCompany Names");
for(int i=0;i<companyNames.length;i++)
{
System.out.println(companyNames[i]);
}
}

public static void printComputer(String computerBrands[]){
	System.out.println("\nComputer Brands");
	for(int i=0;i<computerBrands.length;i++)
{
System.out.println(computerBrands[i]);
}
}

public static String printMobile(String mobileBrands[]){
	return mobileBrands[0];
}

public static String printIpl(String iplTeams[]){
	int length=iplTeams.length-1;
	return iplTeams[length];
}

}