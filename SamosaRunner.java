class SamosaRunner
{
public static void main(String[] chakkli)
{
float price=12.7f;
boolean tasteRemark=true;
Samosa samosa=new Samosa(price,tasteRemark);
System.out.println(samosa.price);
System.out.println(samosa.taste);
System.out.println(samosa.size);
System.out.println(samosa.ingredients);

String[] ing={"potato","flour","chilli","salt"};
Samosa samosa1=new Samosa(16.7f,false,SamosaSize.BIG,ing);

System.out.println(samosa1.price);
System.out.println(samosa1.price);
System.out.println(samosa1.taste);
System.out.println(samosa1.price);
System.out.println(samosa1.size);
System.out.println(samosa1.ingredients);
}
}