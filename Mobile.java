class Mobile
{
public static void main(String[] error){
	float price=Float.parseFloat(error[3]);
	int quanity=Integer.parseInt(error[4]);
	float emi=Float.parseFloat(error[5]);
float total=MobileDetails.getDetailsByMobile(error[0],error[1],error[2],price,quanity,emi,error[6]);
System.out.println(total);

}
}