class MatchSizeRunner
{
public static void main(String[] arg)
{
       String brand="Cycle";
	   int noOfSticks=25;
	   boolean empty=true;
	   
	   MatchBox match=new MatchBox(brand,noOfSticks,empty);
	   System.out.println(match.brand);
	   System.out.println(match.noOfSticks);
	   System.out.println(match.empty);
	   brand="cycle fortune";
	   noOfSticks=34;
	   empty=false;
	   MatchSize size=MatchSize.MEDIUM;
	   MatchBox match1=new MatchBox(brand,noOfSticks,empty,size);
	   System.out.println(match1.brand);
	   System.out.println(match1.noOfSticks);
	   System.out.println(match1.empty);
	   System.out.println(match1.size);
	   
	   
	   
	   
}

}