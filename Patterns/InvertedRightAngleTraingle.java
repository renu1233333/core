class InvertedRightAngleTraingle
{
public static void main(String[] arg)
{
System.out.println("InvertedRightAngleTraingle");
for(int row=1;row<=6;row++)
{
for(int col=1;col<=6;col++)
{
if(row+col<=7)
{
System.out.print("*");
}
}
System.out.println();
}
}
}