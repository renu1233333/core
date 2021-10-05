class PersonalDetail
{
public static void getMessage()
{
System.out.println("Renu Hadapad");
System.out.println("Gadag");
System.out.println("shilpagdg4444@gmail.com");
String msg="Creating method Chain";
printMessage(msg);
}

public static void printMessage(String msg)
{     System.out.println("*************");
	System.out.println(msg);
	getloopingStatement();
}
public static void getloopingStatement()
{
	for(int i=0;i<10;i++)
	{
		getstatement();
	}
}
public static void getstatement()
{
	System.out.println("Method chain");
}
}