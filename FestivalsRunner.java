class FestivalsRunner
{
	enum Months
	{
		JANUARY("New Year"),FEB("shivaratri"),MARCH(""),APRIL("summer holidays"),MAY("summer holidays"),JUNE("holidays ends"),JULY("continue"),AUGUST("continue"),SEPTMEBER("exams"),OCTOBER("winter holidays"),NOVEMBER("midterm"),DECEMBER("year end");
	    String monthSpecial;
		Months(String monthSpecial)
		{
			this.monthSpecial=monthSpecial;
		}
	}
	
public static void main(String[] arg)
{
Festivals fest=Festivals.GANESHCHATURTHI;
System.out.println(fest.fest);
String festref=Festivals.KRISHNAJANMASTAMI.fest;
System.out.println(festref);
System.out.println(Months.APRIL);
System.out.println(Months.MAY.monthSpecial);
}
}