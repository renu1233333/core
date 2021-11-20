
import java.util.Scanner;
class SumOfNumbersUsingDoWhileLoop
{

void printSumOfNumbers(int num)
{int sum=0;
int i=1;
do{
sum+=i;
i++;
}while(i<=num);
System.out.print(sum);
}
public static void main(String[] arg)
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
SumOfNumbersUsingDoWhileLoop loop=new SumOfNumbersUsingDoWhileLoop();
loop.printSumOfNumbers(num);
}

}