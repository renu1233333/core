class Gadgets{
public static void main(String[] args)
{
String[] res=Details.getDetailsForGadgets(args[1]);
if(res!=null)
{
System.out.println(res[0]);
System.out.println(res[1]);
System.out.println(res[2]);
}
else{
	System.out.println("No match found for gadget");
}
}
}