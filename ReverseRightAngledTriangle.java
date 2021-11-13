class  ReverseRightAngledTriangle
{
public static void main(String[] arg)
{
int num=Integer.parseInt(arg[0]);

ReverseRightAngledTriangle triangle=new ReverseRightAngledTriangle();
triangle.reverseRightAngledTriangle(num);

}
public void reverseRightAngledTriangle(int row)
{
for (int i= row; i>= 1; i--)  
{  
for (int j=row; j>i;j--)  
{  
System.out.print(" ");  
}  
for (int k=1;k<=i;k++)  
{  
System.out.print("*");  
}  
System.out.println("");  
}  
}}