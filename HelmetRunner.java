class HelmetRunner
{
public static void main(String[] run )
{
Helmet helmet=new Helmet();
helmet.color="Black";
helmet.price=1500.8f;
helmet.brand="AGV Helmet";
helmet.size=HelmetSize.MEDIUM;


Helmet helmet1=new Helmet();
helmet1.color="white";
helmet1.price=2000.8f;
helmet1.brand="Shoei Helmet";
helmet1.size=HelmetSize.LARGE;


Helmet helmet2=new Helmet();
helmet2.color="orange";
helmet2.price=2007.8f;
helmet2.brand="Shoei Helmet";
helmet2.size=HelmetSize.EXTRALARGE;

helmet.wear();
helmet1.wear();
helmet2.protect();

}
}