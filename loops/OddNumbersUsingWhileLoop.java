
import java.util.Scanner;
class OddNumbersUsingWhileLoop
{

void printOddNumber(int num)
{
int i=1;
while(i<=num)
{if(i%2!=0)
	{
		System.out.print(i+" ");
	}
	i++;
}
}
public static void main(String[] arg)
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
OddNumbersUsingWhileLoop loop=new OddNumbersUsingWhileLoop();
loop.printOddNumber(num);
}

}