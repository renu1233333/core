class FoodItemRunner
{
public static void main(String[] kaju)
{
FoodItem food=new FoodItem();
food.name="parota";
food.price=20.0f;
food.hotelName="mayoora";
food.quantity=2;
food.foodType=FoodType.NORTHINDIAN;
food.ratings=3.8f;
food.orderType=OrderType.ONLINE;
food.displayDetails();
food.printTotalPrice();
food.printTotalFoodItemsPrice();
food.printHotelName();
food.printNameAndPrice();

FoodItem food1=new FoodItem();
food.name="Tteokbokki";
food.price=479.0f;
food.hotelName="Hae Kum Gang";
food.quantity=1;
food.foodType=FoodType.KOREAN;
food.ratings=4.0f;
food.orderType=OrderType.ONLINE;
food.displayDetails();
food.printTotalPrice();
food.printTotalFoodItemsPrice();
food.printHotelName();
food.printNameAndPrice();



}
}