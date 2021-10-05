class MobileDetails{
public static float getDetailsByMobile(String brand,String color,String model,float price,int quantity,float emi,String country)
{
System.out.println(brand+"\n"+color+"\n"+model+"\n"+price+"\n"+quantity+"\n"+emi+"\n"+country);
float total=price*quantity;
return total;
}
}