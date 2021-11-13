class DownwardTriangle
{
public static void main(String[] arg)
{
int num=Integer.parseInt(arg[0]);

DownwardTriangle triangle=new DownwardTriangle();
triangle.downwardTriangle(num);
}

public void downwardTriangle(int rows)
{
	for (int i= rows-1; i>=0 ; i--)  
{  

for (int j=0; j<=i; j++)  
{  

System.out.print("*" + " ");  
}  
 
System.out.println();  
}  
}
}