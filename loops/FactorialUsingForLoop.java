import java.util.Scanner;
class FactorialUsingForLoop
{
int printFactorial(int num){
int fact=1;
for(int i=num;i>=1;i--)

{
fact=fact*i;
}
return fact;
}
public static void main(String[] arg)
{
	FactorialUsingForLoop loop=new FactorialUsingForLoop();
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
 int fact=loop.printFactorial(num);
 System.out.println(fact);
 
 
}
}