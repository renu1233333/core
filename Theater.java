class Theater
{
public static void main(String[] arg)
{
TicketPrice ticket=TicketPrice.BALCONY;
System.out.println(ticket);
System.out.println(ticket.price);
System.out.println(ticket.tax);
System.out.println(TicketPrice.BOX.price);
System.out.println(TicketPrice.BOX.tax);


}
}