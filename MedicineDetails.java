class MedicineDetails{
public static float getDetailsByMedicine(String name,String company,float price,int quanity)
{System.out.println("Medicine name: "+name);
System.out.println("Company Name: "+company);
System.out.println("Price: "+price);
System.out.println("quanity:"+quanity);
float total=price*quanity;
return total;
}
}