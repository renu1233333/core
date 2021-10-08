class MovieTicket
{
String movieName;
String theater;
float price;
int numberOfSeats;
MovieType type;
static float totalPrice;

void displayDetails()
{
	System.out.println(this.movieName);
	System.out.println(this.theater);
	System.out.println(this.price);
	System.out.println(this.numberOfSeats);
	System.out.println(this.type);
	
}
void printTotalPrice()
{    float total=price*numberOfSeats;
      totalPrice+=total;
	System.out.println("total price= "+totalPrice);
}

}