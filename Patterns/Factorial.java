class Factorial
{
public static void main(String[] arg)
{
Factorial factorial=new Factorial();
factorial.printFactorial();
}

void printFactorial()
{int fact=1;

for(int index=5;index>=1;index--)
fact=index*fact;

}
System.out.println(fact);
}
}