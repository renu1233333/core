class EvenNumbersUsingForLoop
{
	
	void printEvenNumbers(int num)
	{
		for(int i=1;i<=num;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
		}
	}
public static void main(String[] args)
{
int num=Integer.parseInt(args[0]);
EvenNumbersUsingForLoop loop=new EvenNumbersUsingForLoop();
loop.printEvenNumbers(num);
}
}