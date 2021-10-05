class LocationRunner
{
public static void main(String[] loc)
{
String name="Agra";
String state="Uttar Pradesh";
String famousFor="Taj Mahal";
String visit="November to February";
Location locDetails=new Location(name,state,famousFor,visit);
System.out.println(locDetails.name+"\n"+locDetails.state+"\n"+locDetails.famousFor+"\n"+locDetails.visit);


name="Shivamogga";
state="Karnataka";
famousFor="Jog Falls";
visit="June to November";
Location locDetail=new Location(name,state,famousFor,visit);
System.out.println(locDetail.name+"\n"+locDetail.state+"\n"+locDetail.famousFor+"\n"+locDetail.visit);



}
}