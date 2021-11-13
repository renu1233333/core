class OuterPattern
{
	public static void main(String[] arg)
	
	{int r=Integer.parseInt(arg[0]);
	int c=Integer.parseInt(arg[1]);
		OuterPattern ref=new OuterPattern();
		
		ref.outerPattern(r,c);
		ref.innerPattern(7,7);
		
	}
	
	public void outerPattern(int r,int c)
	{
		for(int row=1;row<=r;row++)
		{
			for(int col=1;col<=c;col++)
			{
				if(row==1 || row ==r ||col==1 ||col==c)
				{
					System.out.print(row+""+col+"\t");
				}
				else
				{
					System.out.print("\t");
				}
				
			}
			System.out.println();
			
		}
	}
	public void innerPattern(int r,int c)
	{ 
   if(r%2!=0 && c%2!=0)
   {
	int mid=(r/2)+1;
	System.out.println("\n");
		for(int row=1;row<=r;row++)
		{
			for(int col=1;col<=c;col++)
			{
				if(row==mid || col==mid)
				{
					System.out.print(row+""+col+"\t");
				}
				else{
					System.out.print("\t");
				}
			}
			System.out.println();
		}
   }
   else{
	   System.out.println("give only odd numbers");
   }
	}
	
	
	
}