package Basics.constructor.overloadingOfConstrutor;

public class Cloth {
 private String materialType;
 private int noOfButtons;
 private int noOfPockets;
 private String factoryName;
public String getMaterialType() {
	return materialType;
}
public void setMaterialType(String materialType) {
	this.materialType = materialType;
}
public int getNoOfButtons() {
	return noOfButtons;
}
public void setNoOfButtons(int noOfButtons) {
	this.noOfButtons = noOfButtons;
}
public int getNoOfPockets() {
	return noOfPockets;
}
public void setNoOfPockets(int noOfPockets) {
	this.noOfPockets = noOfPockets;
}
public String getFactoryName() {
	return factoryName;
}
public void setFactoryName(String factoryName) {
	this.factoryName = factoryName;
}
 
 public Cloth()
 {
	 System.out.println("default - no arg method");
 }
 
 public Cloth(String material) 
 {
	 this.materialType=material;
 }
 
 public Cloth(String material,int noOfButtons)
 {
	 this.materialType=material;
	 this.noOfButtons=noOfButtons;
 }
 public Cloth(String material,int noOfButtons,int noOfPockets  )
 {
	 this.materialType=material;
	 this.noOfButtons=noOfButtons;
	 this.noOfPockets=noOfPockets;
 }
 public Cloth(String material,int noOfButtons,int noOfPockets,String factoryName  )
 {
	 this.materialType=material;
	 this.noOfButtons=noOfButtons;
	 this.noOfPockets=noOfPockets;
	 this.factoryName=factoryName;
 }
 
 public Cloth(int noOfButtons,int noOfPockets,String factoryName ,String material )
 {
	 this.materialType=material;
	 this.noOfButtons=noOfButtons;
	 this.noOfPockets=noOfPockets;
	 this.factoryName=factoryName;
 }
 
 
 public Cloth(int noOfPockets,String factoryName ,String material,int noOfButtons )
 {
	 this.materialType=material;
	 this.noOfButtons=noOfButtons;
	 this.noOfPockets=noOfPockets;
	 this.factoryName=factoryName;
 }
 
 
 public Cloth(String factoryName ,String material,int noOfButtons,int noOfPockets )
 {
	 this.materialType=material;
	 this.noOfButtons=noOfButtons;
	 this.noOfPockets=noOfPockets;
	 this.factoryName=factoryName;
 }
 
 public Cloth(String factoryName ,int noOfButtons,String material,int noOfPockets )
 {
	 this.materialType=material;
	 this.noOfButtons=noOfButtons;
	 this.noOfPockets=noOfPockets;
	 this.factoryName=factoryName;
 }
 
 
 public Cloth(int noOfButtons,String factoryName ,int noOfPockets,String material )
 {
	 this.materialType=material;
	 this.noOfButtons=noOfButtons;
	 this.noOfPockets=noOfPockets;
	 this.factoryName=factoryName;
 }
 
 public Cloth(int noOfButtons)
 {
	 this.noOfButtons=noOfButtons;
 }
 
 public void displayDetails()
 {   System.err.println("DETAILS");
	 System.out.println(this.factoryName);
	 System.out.println(this.materialType);
	 System.out.println(this.noOfButtons);
	 System.out.println(this.noOfPockets);
 }
 
}
