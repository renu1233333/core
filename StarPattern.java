class StarPattern
{
public static void main(String[] arg)
{
int num=Integer.parseInt(arg[0]);

StarPattern triangle=new StarPattern();
triangle.starPattern(num);
}

public void starPattern(int rows)
{
	for (int i=1; i<=rows; i++)
        {
            for (int j=1; j<=i; j++)
            {
                if( j == 1 || j == i || i == rows)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
}
}