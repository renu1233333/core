
import java.util.Scanner;
class OddNumbersUsingDoWhileLoop
{

void printOddNumber(int num)
{
int i=1;
do{
if(i%2!=0)
{
System.out.print(i+" ");
}
i++;
}while(i<=num);
}
public static void main(String[] arg)
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
OddNumbersUsingDoWhileLoop loop=new OddNumbersUsingDoWhileLoop();
loop.printOddNumber(num);
}

}