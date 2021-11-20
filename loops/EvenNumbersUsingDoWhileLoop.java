class EvenNumbersUsingDoWhileLoop
{
	void printEvenNumbers(int num)
	{
		
		int i=1;
		
		do{
			if(i%2==0)
			{
				System.out.print(i+" ");
				
			}
			i++;
		}while(i<=num);
	}
public static void main(String[] arg)
{
int num=Integer.parseInt(arg[0]);
EvenNumbersUsingDoWhileLoop loop=new EvenNumbersUsingDoWhileLoop();
loop.printEvenNumbers(num);


}
}