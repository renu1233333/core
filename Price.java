class Price{
public static float getTotalPrice(String name,int quantity,float price)

{
System.out.println("Name "+name);
System.out.println("Quantity "+quantity);
System.out.println("Price "+price);
float total=quantity*price;
return total;
}
}