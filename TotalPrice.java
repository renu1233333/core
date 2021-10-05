class TotalPrice{
	
public static float getTotalPrice(String name,int quantity,float price)

{
System.out.println("Name "+name);
System.out.println("Quantity "+quantity);
System.out.println("Price "+price);
float total=quantity*price;
return total;
}	
	
	
public static void main(String[] args)
{  
int quantity=Integer.parseInt(args[1]);
float price=Float.parseFloat(args[2]);
float total=getTotalPrice(args[0],quantity,price);
System.out.println(total);
}
}


