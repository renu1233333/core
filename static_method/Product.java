class Product
{ 
String name;
float price;
String type;
int quantity;
String vendor;
static float totalProductCost;

void printTotalCost()
{
float totalPrice=quantity*price;
System.out.println("Price= "+totalPrice);
totalProductCost+=totalPrice;
}
void displayDetails()
{
System.out.println(this.name);
System.out.println(this.price);
System.out.println(this.type);
System.out.println(this.quantity);
System.out.println(this.vendor);
}

void printTotalProductsCost()
{
System.out.println("\ntotal price= "+totalProductCost);
}
}