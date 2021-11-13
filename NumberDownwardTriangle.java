class NumberDownwardTriangle
{
public static void main(String[] arg)
{
int num=Integer.parseInt(arg[0]);

NumberDownwardTriangle triangle=new NumberDownwardTriangle();
triangle.numberDownwardTriangle(num);
}

public void numberDownwardTriangle(int rows)
{
	for (int i= rows; i>=1 ; i--)  
{  

for (int j=1; j<=i; j++)  
{  

System.out.print(j);  
}  
 
System.out.println();  
}  
}
}