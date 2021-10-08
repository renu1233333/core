class MovieTicketRunner
{
public static void main(String[] soyasticks)
{
MovieTicket ticket=new MovieTicket();
ticket.movieName="kotigobba 2";
ticket.theater="Laxmi Theater";
ticket.price=100;
ticket.numberOfSeats=3;
ticket.type=MovieType.BALCONY;
ticket.displayDetails();
ticket.printTotalPrice();

MovieTicket ticket1=new MovieTicket();
ticket1.movieName="Rangitaranga";
ticket1.theater="Krishna Theater";
ticket1.price=100;
ticket1.numberOfSeats=4;
ticket1.type=MovieType.BALCONY;
ticket1.displayDetails();
ticket1.printTotalPrice();
}
}