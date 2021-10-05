class LunchBoxRunner
{
public static void main(String[] arg)
{
String type="Plastic";
String color="Red";
float weight=2;
int numberOfBoxes=1;
LunchBox lunch=new LunchBox( type,color, weight, numberOfBoxes);
System.out.println(lunch.type+"\n"+lunch.color+"\n"+lunch.weight+"\n"+lunch.numberOfBoxes);

type="Steel";
color="silver";
numberOfBoxes=2;
LunchBox lunch1=new LunchBox(type,color,numberOfBoxes);
System.out.println(lunch1.type);
System.out.println(lunch1.color);
System.out.println(lunch1.weight);
System.out.println(lunch1.numberOfBoxes);

}
}