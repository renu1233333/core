class  NumberRightAngledTriangle
{
public static void main(String[] arg)
{
int num=Integer.parseInt(arg[0]);

NumberRightAngledTriangle triangle=new NumberRightAngledTriangle();
triangle.numberRightAngledTriangle(num);

}

public void numberRightAngledTriangle(int num)
{
for(int i=1; i<=num; i++)   
{   
for(int j=1; j<=i; j++)   
{   
System.out.print(i);   
}   
System.out.println();   
}
}
}