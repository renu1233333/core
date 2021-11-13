class InvertedRightAngleTraingle
{
public static void main(String[] arg)
{
System.out.println("InvertedRightAngleTraingle");
for(int row=1;row<=5;row++)
{
for(int col=1;col<=5;col++)
{
if(row+col<=6)
{
System.out.print("*");
}
}
System.out.println();
}
}
}