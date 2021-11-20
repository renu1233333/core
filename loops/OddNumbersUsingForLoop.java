
import java.util.Scanner;
class OddNumbersUsingForLoop
{

void printOddNumber(int num)
{
for(int i=1;i<=num;i++)
{
if(i%2!=0)
{
System.out.print(i+" ");
}
}
}
public static void main(String[] arg)
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
OddNumbersUsingForLoop loop=new OddNumbersUsingForLoop();
loop.printOddNumber(num);
}

}