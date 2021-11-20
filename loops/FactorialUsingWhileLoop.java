import java.util.Scanner;
class FactorialUsingWhileLoop
{
int printFactorial(int num){
int fact=1;
while(num!=0)
{
fact=fact*num;
num--;
}
return fact;
}
public static void main(String[] arg)
{
	FactorialUsingWhileLoop loop=new FactorialUsingWhileLoop();
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
 int fact=loop.printFactorial(num);
 System.out.println(fact);
 
 
}
}