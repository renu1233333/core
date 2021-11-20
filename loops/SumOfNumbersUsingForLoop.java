
import java.util.Scanner;
class SumOfNumbersUsingForLoop
{

void printSumOfNumbers(int num)
{int sum=0;
for(int i=1;i<=num;i++)
{
sum+=i;
}
System.out.print(sum);
}
public static void main(String[] arg)
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
SumOfNumbersUsingForLoop loop=new SumOfNumbersUsingForLoop();
loop.printSumOfNumbers(num);
}

}