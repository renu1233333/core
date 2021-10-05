class ForestRunner
{
public static void main(String[] samosa)
{
Forest forest=new Forest("bannerugatta","karnataka");
System.out.println(forest.name);
System.out.println(forest.location);
System.out.println(forest.reserved);
System.out.println(forest.state);

forest.state=new State("karnataka",39,"Shri Umesh Vishwanath Katti");
State state=forest.state;

System.out.println(state.name);
System.out.println(state.numberOfDistrict);
System.out.println(state.forestMinister);
System.out.println(state.capitalCity);
state.capitalCity=new CapitalCity("Bangalore",67562686l);
CapitalCity capital=state.capitalCity;
capital.famousFor="software comapny";
System.out.println(capital.name);
System.out.println(capital.population);
System.out.println(capital.famousFor);

}
}