class LunchBox
{
String type;
String color;
float weight;
int numberOfBoxes;

LunchBox(){
}

LunchBox(String type,String color,float weight,int numberOfBoxes)
{
System.out.println("*************************************");
this.type=type;
this.color=color;
this.weight=weight;
this.numberOfBoxes=numberOfBoxes;
}
LunchBox(String type,String color,int numberOfBoxes)
{
	System.out.println("****************************************");
	this.type=type;
	this.color=color;
	this.weight=500f;
	this.numberOfBoxes=numberOfBoxes;
	
}

}