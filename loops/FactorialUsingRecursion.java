
import java.util.Scanner;
class FactorialUsingRecursion
{
int printFactorialUsingRecursion(int num){
	
	fact=fact*num;
	num--;
	if(num!=0)
	{
	return printFactorialUsingRecursion(num);
	}
return fact;
}
public static void main(String[] arg)
{
	FactorialUsingRecursion loop=new FactorialUsingRecursion();
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
 int fact=loop.printFactorialUsingRecursion(num);
 System.out.println(fact);
 
 
}
}