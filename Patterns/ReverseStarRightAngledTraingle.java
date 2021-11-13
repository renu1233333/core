
class ReverseStarRightAngledTraingle
{
public static void main(String[] args)
{
//ReverseStarRightAngledTraingle
System.out.println("ReverseStarRightAngledTraingle");
for(int row=1;row<=5;row++)
{
for(int col=1;col<=5;col++)
{
if(row<=col)
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.println("\t");
}
}
}