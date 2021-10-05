class Sword
{
float inch;
static void killBySword()
{
System.out.println("Invoking static method");
Sword s=new Sword();
s.cutBySword();

}

void cutBySword()
{
	System.out.println("**********************");
System.out.println("Invoking non static method");
System.out.println(inch);
practiceBySword();
anotherCutBySword();

}
static void practiceBySword()
{
	System.out.println("Invoking static method");
	oneMoreTimePractice();
}
void anotherCutBySword()
{
	System.out.println("Invoking instance method from other instance");
}
static void oneMoreTimePractice()
{
	System.out.println("Invoking static from another static method");
}
}