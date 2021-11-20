import java.util.Scanner;
class EvenNumbersUsingRecursion
{
	void printEvenNumbers(int num1,int num2)
	{
		if(num1>num2)
		{
		return;
		}
		System.out.print(num1+ " ");
		printEvenNumbers(num1+2,num2);
	}
public static void main(String[] arg)
{Scanner sc=new Scanner(System.in);
int num1=2;
int num2=sc.nextInt();
EvenNumbersUsingRecursion loop=new EvenNumbersUsingRecursion();
loop.printEvenNumbers(num1,num2);


}
}