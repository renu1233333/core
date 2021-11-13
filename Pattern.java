class Pattern
{
	public static void main(String[] arg)
	{
		Pattern pattern=new Pattern();
		pattern.rightAngledTriangle();
		pattern.leftAngledTriangle();
		pattern.leftDownwardTriangle();
		pattern.rightDownwardTriangle();
		pattern.pyramidTriangle();
		
	}
      public void rightAngledTriangle()
	  {  System.out.println("Right angled traingle");
		  for(int cat=1;cat<=5;cat++)
		{
			for(int dog=1;dog<=cat;dog++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		 System.out.println();
	  }
	 
	  
	  public void leftAngledTriangle()
	  {  System.out.println();
		  for(int i=1;i<=5;i++)
		  {
			  for(int j=5;j>=i;j--)
			  {  
				  System.out.print(" ");
			  }
			  
			  for(int k=1;k<=i;k++)
			  {
				  System.out.print("*");
			  }
			  System.out.println();
		  }
		  System.out.println();
	  }
	  
	  public void leftDownwardTriangle()
	  {System.out.println();
		  for(int i=1;i<=5;i++)
		  {
			  for(int j=5;j>=i;j--)
			  {
				  System.out.print("*");
			  }
			  System.out.println();
		  }
		  System.out.println();
	  }
	  
	 public void rightDownwardTriangle()
	 {System.out.println("rightDownwardTriangle");
		 for(int i=5;i>=1;i--)
		 {
			 for(int j=5;j>=i;j--)
			 {
				 System.out.print(" ");
			 }
			 for(int k=1;k<=i;k++)
			 {
			 System.out.print("*");
			 }
			 System.out.println();
		 }
	 }

    public void pyramidTriangle()
	{
		 System.out.println("pyramidTriangle");
		 for(int i=1;i<=5;i++)
		 {
			 for(int j=5;j>=i;j--)
			 {
				 System.out.print(" ");
			 }
			 for(int k=1;k<=(i*2)-1;k++)
			 {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		 System.out.println();
	}	
}