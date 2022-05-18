package Basics.constructor.overloadingOfConstrutor;

public class ClothRunner {

	public static void main(String[] args) {
		Cloth clothRef1=new Cloth();
		Cloth clothRef2=new Cloth("cotton");
		Cloth clothRef3=new Cloth("nynol",6);
		Cloth clothRef4=new Cloth("fabric",6,1);
		Cloth clothRef5=new Cloth("cotton",6,1,"sugra");
		Cloth clothRef6=new Cloth("cotton","ponnappa",6,1);
		
		clothRef1.displayDetails();
		clothRef2.displayDetails();
		clothRef3.displayDetails();
		clothRef4.displayDetails();
		clothRef5.displayDetails();
		clothRef6.displayDetails();
	}

}
