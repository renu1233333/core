
enum Week
{
SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
}
class DayRunner
{
Week day;
DayRunner()
{
	
}
DayRunner(Week week)
{
this.day=week;
}
public void getMessage()
{
	switch(day)
	{
		case SUNDAY:
		{
			System.out.println("Sunday,,,yehhh Its Holiday");
			break;
		}
		case MONDAY:
		{
			 System.out.println("Mondays are bad.");
			break;
		}
		case TUESDAY:
		{
			System.out.println("Tuesdays are bad");
			break;
		}
		case WEDNESDAY:
		{
			System.out.println("Wednesdays are very slow");
			break;
		}
		case THURSDAY:
		{
			System.out.println("Thursdays are better");
			break;
		}
		case FRIDAY:
		{
			System.out.println("Fridays are better");
			break;
		}
		case SATURDAY:
		{
			System.out.println("Saturday are best");
			break;
		}
		default:
		{
			System.out.println("You have given wrong day");
		}
		
	}
}

public static void main(String[] arg)
{
String week="SATURDAY";
DayRunner dayRef=new DayRunner(Week.valueOf(week));
dayRef.getMessage();

}
}