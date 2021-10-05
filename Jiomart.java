class Jiomart{
public static void getDetailsFromJiomart(String product)
{
if(product.equals("fruit")){
String[] details={"orange","1 Kg","Btm"};
System.out.println(details[0]);
System.out.println(details[1]);
System.out.println(details[2]);
}
if(product.equals("cloth")){
String[] details={"Printed Straight kurta","1 piece","Btm"};
System.out.println(details[0]);
System.out.println(details[1]);
System.out.println(details[2]);
}
if(product.equals("bakery")){
	System.out.println("No products are available");
}
if(product.equals("biscuits")){
	String[] details={"sunfeastDark Fantasy","75 g","Btm"};
	System.out.println(details[0]);
System.out.println(details[1]);
System.out.println(details[2]);
	
}

}
}