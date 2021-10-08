class ProductRunner
{
public static void main(String[] navaratri)
{
Product product=new Product();
product.name="Television";
product.price=14000.000f;
product.type="electronics";
product.quantity=1;
product.vendor="Mi 4a";

product.displayDetails();
product.printTotalCost();

Product product1=new Product();
product1.name="Head Phone";
product1.price=1499.9f;
product1.type="electronics";
product1.quantity=2;
product1.vendor="Boat";

product1.displayDetails();
product1.printTotalCost();
product.printTotalProductsCost();
}
}