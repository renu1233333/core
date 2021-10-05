class NailCutterRunner
{
public static void main(String[] nail)
{
NailCutter cut=new NailCutter();
cut.price=20.0f;
cut.size=NailCutterSizes.BIG;
cut.color="Orannge";
cut.sharp=true;
cut.brand="vega";

NailCutter cut1=new NailCutter();
cut1.price=30.0f;
cut1.size=NailCutterSizes.SMALL;
cut1.color="Pink";
cut1.sharp=false;
cut1.brand="victoria";
cut.cut();
cut1.sharp();
}
}