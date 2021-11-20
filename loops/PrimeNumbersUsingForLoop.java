
import java.util.Scanner;
class PrimeNumbersUsingForLoop
{

void printPrimeNumbers(int num)
{
	int i=0;
int n=0;
String primeNumbers="";
for (i = 1; i <= num; i++)  	   
      { 		 		  
         int counter=0; 		  
         for(n =i; n>=1; n--)
         {
	    if(i%n==0)
	    {
		counter = counter + 1;
	    }
	 }
	 if (counter ==2)
	 {
	    
	    primeNumbers = primeNumbers + i + " ";
	 }	
      }	
	  
	  System.out.print(primeNumbers);
}
public static void main(String[] arg)
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
PrimeNumbersUsingForLoop loop=new PrimeNumbersUsingForLoop();
loop.printPrimeNumbers(num);
}

}