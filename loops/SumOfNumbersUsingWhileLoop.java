
import java.util.Scanner;
class SumOfNumbersUsingWhileLoop
{

void printSumOfNumbers(int num)
{int sum=0;
int i=1;
while(i<=num)
{
sum+=i;
i++;
}
System.out.print(sum);
}
public static void main(String[] arg)
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
SumOfNumbersUsingWhileLoop loop=new SumOfNumbersUsingWhileLoop();
loop.printSumOfNumbers(num);
}

}