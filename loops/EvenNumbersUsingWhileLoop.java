class EvenNumbersUsingWhileLoop
{
	void printEvenNumbers(int num)
	{int i=1;
		while(i<=num)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
			i++;
		}
	}
public static void main(String[] arg)
{
	int num=Integer.parseInt(arg[0]);
	
EvenNumbersUsingWhileLoop loop=new EvenNumbersUsingWhileLoop();
loop.printEvenNumbers(num);
System.out.println(n1);
System.out.println(loop.n2);

}
}