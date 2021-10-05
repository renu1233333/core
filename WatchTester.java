class WatchTester
{
public static void main(String[] dosas)
{
Watch watch=new Watch(478,"Rolex");
System.out.println(watch.model);
System.out.println(watch.brand);
System.out.println(watch.light);
Light light=watch.light;
System.out.println(light.on);
}
}