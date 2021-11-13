class PrimarySecondaryDiagonals
{
public static void main(String[] arg)
{

System.out.println("PrimarySecondaryDiagonals");
for(int row=1;row<=5;row++)
{
	for(int col=1;col<=5;col++)
	{
		if(row==col)
		{
			System.out.print("*");
			
		}
		else if(row+col==6)
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