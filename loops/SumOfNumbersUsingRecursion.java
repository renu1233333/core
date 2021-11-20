
import java.util.Scanner;
class SumOfNumbersUsingRecursion
{

int printSumOfNumbers(int num)
{if(num!=0)
{
return  num+printSumOfNumbers(num-1);
}
return num;
}
public static void main(String[] arg)
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
SumOfNumbersUsingRecursion loop=new SumOfNumbersUsingRecursion();
int n=loop.printSumOfNumbers(num);
System.out.print(n);
}

}