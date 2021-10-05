class GasCylinderRunner
{
	public static void main(String[] argg)
	{
		float price=887.5f;
		float weightInKg=14.2f;
		long number=18002333555l;
		Size size=Size.MEDIUM;
		Company companyName=Company.INDEN;
		GasCylinder gas=new GasCylinder(price,weightInKg,number,size,companyName);
		
		
		System.out.println(gas.price);
		System.out.println(gas.weight);
		System.out.println(gas.cylinderNumber);
		System.out.println(gas.companyName);
		System.out.println(gas.size);
	}
}