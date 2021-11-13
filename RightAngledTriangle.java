class  RightAngledTriangle
{
public static void main(String[] arg)
{
int num=Integer.parseInt(arg[0]);

RightAngledTriangle triangle=new RightAngledTriangle();
triangle.rightAngledTriangle(num);

}

public void rightAngledTriangle(int num)
{
for(int i=1; i<=num; i++)   
{   
for(int j=1; j<=i; j++)   
{   
System.out.print("* ");   
}   
System.out.println();   
}
}
}