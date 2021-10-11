class MiPhoneRunner
{
public static void main(String[] kajubarfi)
{
MiPhone mi=new MiPhone();
mi.setBrand("Xiaomi Redmi 9");
mi.setPrice(13999);
mi.setColor("Blue");
PhonePay phone=null;
mi.setPhonePay(phone);
mi.phonePay=new PhonePay();
PhonePay pay=mi.phonePay;
pay.setCompany("PhonePay");
pay.setVersion("V 4.1.8");
pay.setArchitect("Phaneesh N");


System.out.println(mi.brand);
System.out.println(mi.price);
System.out.println(mi.color);
System.out.println(mi.phonePay);



System.out.println("************");
System.out.println(pay.company);
System.out.println(pay.version);
System.out.println(pay.architect);


}
}