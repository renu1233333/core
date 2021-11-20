import java.util.Scanner;
class FactorialUsingDoWhileLoop
{
int printFactorial(int num){
int fact=1;
do{
fact=fact*num;
num--;
}while(num!=0);
return fact;
}
public static void main(String[] arg)
{
	FactorialUsingDoWhileLoop loop=new FactorialUsingDoWhileLoop();
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
 int fact=loop.printFactorial(num);
 System.out.println(fact);
 
 
}
}