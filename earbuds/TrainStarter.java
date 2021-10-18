package com.xworkz.earbuds;

public class TrainStarter {

	public static void main(String[] args) {

		String trainNo="02845";
		trainNo=trainNo.concat("Vignesh Travelled , to meet grandma");
		System.out.println(trainNo);
		String trainNo1=new String("02846");
		trainNo=trainNo1.concat("Vignesh came back");
		System.out.println(trainNo1);
		System.out.println(trainNo);
		
		System.out.println(trainNo1+null);
		// Mad -- Nimhans
		String max=null;
		System.out.println(max);
		
		String hospital=new String("Jaydeva");
		hospital=hospital.toUpperCase();
		System.out.println(hospital);
		String kidney=hospital.toLowerCase();
		System.out.println(hospital);
		System.out.println(kidney);
		
		
		String hospital1=new String("Jaydeva");
		hospital1.toUpperCase();
		System.out.println(hospital1);
		if(hospital==hospital1)
		{
			System.out.println("both hospital and hospital1 pointing to same memory");
		}
		else {
			System.out.println("both hospital and hospital1 pointing to different memory");
		}
		
		
		
		
		String medicine="Dolo 65";
		String instanceMedicine=new String("Dolo 65");
		if(medicine==instanceMedicine)
		{
			System.out.println("both medicine and insance medicine are same memory");
		}
		else {
			System.out.println("both medicine and insance medicine are different memory");
		}
		medicine="45";
		boolean equal=medicine.equals(null);// primitive or non primit
		System.out.println("both content is "+equal);
		
		
		// null  pointer ==== HE/ SHE doesnot no development
		medicine=null;
		if(medicine!=null)
		{
		System.out.println(medicine);
		medicine=medicine.toUpperCase();
		System.out.println(medicine);
		}
	}

}
