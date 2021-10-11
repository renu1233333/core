class TubelightRunner
{
public static void main(String[] light)
{ Tubelight tubeRef=new Tubelight();
String name=tubeRef.getName();
System.out.println(name);
int watt=tubeRef.getWatts();
System.out.println(watt);
tubeRef.setName("Philips");
tubeRef.setWatts(10);
name=tubeRef.getName();
System.out.println(name);
watt=tubeRef.getWatts();
System.out.println(watt);
}
}