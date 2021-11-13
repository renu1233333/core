class HallowMirrorRightAngledTraingle
{
public static void main(String[] arg)
{
System.out.println("HallowMirrorRightAngledTraingle");
for(int row=1;row<=5;row++)
{
for(int col=1;col<=5;col++)
{
if(row==5)
{
System.out.print("*");
}
else if(col==5)
{
System.out.print("*");
}
else if(col+row==6)
{
System.out.print("*");
}
else{
System.out.print(" ");
}

}
System.out.println();
}
}
}