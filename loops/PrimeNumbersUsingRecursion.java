
import java.util.Scanner;
class PrimeNumbersUsingRecursion
{

boolean printPrimeNumbers(int num)
{
	 
   
    for(int i=2;i<=num/2;i++){ 
        if(num%i==0){ 
            return false; 
        } 
    } 
    return true; 
} 
      

public static void main(String[] arg)
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
PrimeNumbersUsingRecursion loop=new PrimeNumbersUsingRecursion();
for(int index=2;index<num;index++){ 
        if(loop.printPrimeNumbers(index)){ 
            System.out.print(index+ " ");
        } 
    } 

}

}