class FestivalRunner
{
public static void main(String[] arg)

{
Festival fes=new Festival();
System.out.println(fes.festivalName+"\n"+fes.month+"\n"+fes.numberofDays+"\n"+fes.worshipGod);
String festivalName="Dasara";
String month="November";
int numberofDays=5;
String worshipGod="Durga Devi";
Festival fes1=new Festival(festivalName,month,numberofDays,worshipGod);
System.out.println(fes1.festivalName+"\n"+fes1.month+"\n"+fes1.numberofDays+"\n"+fes1.worshipGod);
Festival fes2=new Festival("Goddess Lakshmi","November",3);
System.out.println(fes2.festivalName+"\n"+fes2.month+"\n"+fes2.numberofDays+"\n"+fes2.worshipGod);
Festival fes3=new Festival("Bakrid ","July");
System.out.println(fes3.festivalName+"\n"+fes3.month+"\n"+fes3.numberofDays+"\n"+fes3.worshipGod);
Festival fes4=new Festival("Krishna Janmastami");
System.out.println(fes4.festivalName+"\n"+fes4.month+"\n"+fes4.numberofDays+"\n"+fes4.worshipGod);

Festival fes6=new Festival("Shivaratri",1);
System.out.println(fes6.festivalName+"\n"+fes6.month+"\n"+fes6.numberofDays+"\n"+fes6.worshipGod);
Festival fes7=new Festival("september",1,"Lord Ganesh");
System.out.println(fes7.festivalName+"\n"+fes7.month+"\n"+fes7.numberofDays+"\n"+fes7.worshipGod);
Festival fes8=new Festival(1,"Krishna");
System.out.println(fes8.festivalName+"\n"+fes8.month+"\n"+fes8.numberofDays+"\n"+fes8.worshipGod);





}

}