enum TicketPrice
{
GANDHI(30,0.0f),MIDDLE(50,0.5f),BALCONY(100,1.0f),BOX(150,1.5f);
int price;
float tax;

TicketPrice(int price,float tax)
{
	this.price=price;
	this.tax=tax;
}
}