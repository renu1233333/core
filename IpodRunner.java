class IpodRunner
{
public static void main(String[] run)
{
Ipod ipod=new Ipod();
ipod.generation=IpodGeneration.APPLEIPODMINI;
ipod.price=34567.8f;
ipod.color="Black";
ipod.playGames();

Ipod ipod1=new Ipod();
ipod.generation=IpodGeneration.APPLEIPODSHUFFLE;
ipod.price=3700.8f;
ipod.color="white";
ipod.message();


Ipod ipod2=new Ipod();
ipod.generation=IpodGeneration.APPLEIPODTOUCH;
ipod.price=29600f;
ipod.color="silver color";
ipod.message();


}
}