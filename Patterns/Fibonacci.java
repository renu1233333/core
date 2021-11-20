class Fibonacci
{
public static void main(String[] arg)
{
Fibonacci fibonacci=new Fibonacci();
fibonacci.printUsingWhileLoop();
fibonacci.printUsingDoWhileLoop();
fibonacci.printUsingForLoop();
}


void printUsingWhileLoop()
{
int index=1;
int sum,num1=0,num2=1;
while(index<=10)
{

System.out.print(num1+" ");
sum=num1+num2;
num1=num2;
num2=sum;

index++;

}
}


void printUsingDoWhileLoop()
{ int index=1,sum,num1=0,num2=1;
System.out.println();
	do{
		System.out.print(num1+ " ");
		sum=num1+num2;
		num1=num2;
		num2=sum;
		index++;
	}while(index<=10);
}

void printUsingForLoop()
{

int sum,num1=0,num2=1;
System.out.println();
for(int index=1;index<=10;index++)
{

System.out.print(num1+" ");
sum=num1+num2;
num1=num2;
num2=sum;

}


}
}