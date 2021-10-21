package com.xworkz.crud;
import com.xworkz.crud.operation.*;
public class CoolDrinkStarter {

	public static void main(String[] args) {
		
		CoolDrinkOperator operator=new CoolDrinkOperator();
		operator.addName("pepsi");
		operator.addName("maza");
		operator.addName("coke");
		operator.addName("slice");
		operator.addName("7 up");
		operator.addName("sting");
		operator.addName("sprite");
		
		String[] array=operator.getName();
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}

		operator.deleteName(4);
		
		array=operator.getName();
		System.out.println("*******after delete**********");
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		
		operator.update(0, "mirinda");
		array=operator.getName();
		System.out.println("*********after update**********");
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		
	}

}
