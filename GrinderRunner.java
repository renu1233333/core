class GrinderRunner
{
public static void main(String[] run)
{
Grinder grinder=new Grinder(16,"Preethi Zodiac MG");
System.out.println(grinder.capacity);
System.out.println(grinder.company);
System.out.println(grinder.motor);
Motor motor=grinder.motor;
System.out.println(motor.brand);
System.out.println(motor.rpm);


}
}