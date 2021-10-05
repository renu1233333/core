
enum TrafficSignal
{
RED("STOP"),GREEN("GO"),ORANGE("SLOW DOWN");
String action;
TrafficSignal(String action)
{
this.action=action;
}

public String getAction()
{
return this.action;
}
}
class MethodInsideEnumRunner
{
public static void main(String[] arg)
{
TrafficSignal[] signal=TrafficSignal.values();
for(TrafficSignal traffic:signal )
{
System.out.println(traffic.name());
System.out.println(traffic.getAction());
}
}
}