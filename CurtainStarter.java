class CurtainStarter
{
public static void main(String[] args)

{

Curtain curtain=new Curtain();

String name=curtain.getName();
System.out.println("Curtain Name ="+ curtain);

float price=curtain.getPrice();
System.out.println("Curtain price="+ price);

String brand=curtain.getBrand();
System.out.println("Curtain Brand="+ brand);

int noOfCurtains=curtain.getnoOfCurtains();
System.out.println("number of Curtains ="+ noOfCurtains);

String color=curtain.getColor();
System.out.println("Cutain color="+ color);



curtain.setName("winifredc ");
String name1=curtain.getName();
System.out.println("Curtain name="+ name1);


curtain.setPrice(250);
float price1=curtain.getPrice();
System.out.println("curtain price="+ price1);

curtain.setBrand("cortina");
String brand1=curtain.getBrand();
System.out.println("curtain brand="+brand1);


curtain.setNoOfCurtains(15);
int noOfCurtains1=curtain.getnoOfCurtains();
System.out.println(" noOfCurtains="+ noOfCurtains1);


curtain.setColor("Black");
String color1=curtain.getColor();
System.out.println("color="+color1);


}
}