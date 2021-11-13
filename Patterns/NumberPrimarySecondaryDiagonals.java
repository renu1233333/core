class NumberPrimarySecondaryDiagonals
{
public static void main(String[] arg)
{

System.out.println("PrimarySecondaryDiagonals");
for(int row=1;row<=5;row++)
{
	for(int col=1;col<=5;col++)
	{
		if(row==col)
		{  if(row==3 && col==3){
			System.out.print(row-1);
		}
		else{
			System.out.print(col);
		}
		}
		else if(row+col==6)
		{
			System.out.print(col);
		}
		else{
			System.out.print(" ");
		}
	}
	System.out.println();
}
}
}