class FoodItem
{
String name;
float price;
String hotelName;
int quantity;
FoodType foodType;
float ratings;
OrderType orderType;
static float totalFoodItemsPrice;
void displayDetails()
{    
	System.out.println(this.name);
	System.out.println(this.price);
	System.out.println(this.hotelName);
	System.out.println(this.quantity);
	System.out.println(this.foodType);
	System.out.println(this.ratings);
	System.out.println(this.orderType);
	System.out.println();
}

void printTotalPrice()
{
	float total=price*quantity;
	System.out.println("Total price= "+total);
	totalFoodItemsPrice+=total;
}
void printTotalFoodItemsPrice()
{
	System.out.println("\nTotal food item price= "+totalFoodItemsPrice);
	
}
void printHotelName()
{System.out.println("Printing Hotel Name");
	System.out.println(hotelName);
}
void printNameAndPrice()
{
	System.out.println("Printing Name and price");
	System.out.println(name);
	System.out.println(price);
	
}
}