class CountryRunner
{public static void main(String[] rule)
{
	String name="India";
	int numberOfStates=29;
	String pmName="Narendra Modhi";
	String presidentWife="Savita Kovind";
	
Countries con=new Countries(name,numberOfStates,pmName,presidentWife);
System.out.println(con.name);
System.out.println(con.numberOfStates);
System.out.println(con.primeMinisterName);
System.out.println(con.presidentWifeName);

name="Australia";
numberOfStates=29;
pmName="Scott Morrison";
presidentWife="Helen";


Countries cont=new Countries(name,numberOfStates,pmName,presidentWife);
System.out.println(cont.name);
System.out.println(cont.numberOfStates);
System.out.println(cont.primeMinisterName);
System.out.println(cont.presidentWifeName);
}
}