class RightStarPattern
{
public static void main(String[] arg)
{
int num=Integer.parseInt(arg[0]);

RightStarPattern triangle=new RightStarPattern();
triangle.rightStarPattern(num);
}

public void rightStarPattern(int rows)
{
	for (int i=1; i<=rows; i++)
        {
            
            for (int j=rows; j>i; j--)
            {
                System.out.print(" ");
            }
            
            for (int k=1; k<=i; k++)
            {
                if( k == 1 || k == i || i == rows)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
}
}