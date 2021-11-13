class MirroredRightTriangle1
{
public static void main(String[] arg)
{
int num=Integer.parseInt(arg[0]);

MirroredRightTriangle1 triangle=new MirroredRightTriangle1();
triangle.mirroredRightTriangle(num);
}

public void mirroredRightTriangle(int n)
{
	for (int i= 0; i<= n; i++)  
{  
 
for (int j=1; j<=n-i; j++)  
{  
System.out.print(" ");  
}  
for (int k=0;k<=i;k++)  
{  
System.out.print("*");  
}   
System.out.println("");  
}  
}
}