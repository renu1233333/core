class HallowStarRightAngledTriangle
{
public static void main(String[] args)
{
System.out.println("HallowStarRightAngledTriangle");
for(int row=1;row<=5;row++)
{
for(int col=1;col<=5;col++)
{
if(row==col)
{
System.out.print("*");
}
else if(row==5)
{System.out.print("*");
}
else if(col==1)
{System.out.print("*");
}
else{
	System.out.print(" ");
}
}
System.out.println();
}
}
}