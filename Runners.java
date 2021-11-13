enum    Direction extends Market
{
	NORTH,SOUTH,WEST,EAST;
}

class Runners
{
	public static void main(String[] args)
	{
		
		Direction dir1=new Direction();
		System.out.println(dir1.NORTH);
		System.out.println(Direction.EAST);
		Direction[] direction=Direction.values();
		for(int i=0;i<direction.length;i++)
		{
			System.out.println(direction[i]);
		}
		
		for(Direction dir:direction)
		{
			System.out.println(dir);
		}
		
		Direction dir=Direction.NORTH;
		System.out.println(dir);
		dir=NORTH;
		System.out.println(dir);
	}
}