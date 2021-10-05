enum NewspaperType
{
DAILY(4.2f),WEEKLY(28.8f),MONTHLY(137.2f);
float price;

NewspaperType(float price)
{
	this.price=price;
}
}