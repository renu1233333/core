class Product
{
	String name;
	String type;
	float price;
	int quantity;
	String vendor;
	
	
	void displayDetails()
	{
		System.out.println(this.name);
		System.out.println(this.type);
		System.out.println(this.price);
		System.out.println(this.quantity);
		System.out.println(this.vendor);
	}
}