class NartakiTheaterRunner
{
public static void main(String[] args)
{
String name="Nartaki";
String location="majestic";
TheaterRunner theater=new TheaterRunner(name,location,TicketPrice.MIDDLE);
System.out.println(theater.name);
System.out.println(theater.location);
System.out.println(theater.ticketPrice);
System.out.println(theater.capacity);
System.out.println(theater.ticketPrice.price);
}
}