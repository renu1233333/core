package com.xworkz.objectoverride;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.xworkz.objectoverride.constants.BagColor;

public class BagRunner {

	public static void main(String[] args) {
		Bag bag=new Bag();
		Bag bag1=new Bag();
		System.out.println(bag.hashCode());
		System.out.println(bag.toString());
		bag.setColor(BagColor.WHITE);
		bag1.setColor(BagColor.WHITE);
		bag.setPrice(600.5f);
		bag1.setPrice(600.5f);
		System.out.println(bag.equals(bag1));
    
		
		Class ref=bag.getClass();
        System.out.println(ref);
       System.out.println(ref.getSimpleName());
       System.out.println(ref.getModifiers());
       System.out.println();
       
       Field[] field=ref.getFields();
       System.out.println(field.length);
       System.out.println("***");
       for(int i=0;i<field.length;i++)
       {
       
       	Field fieldRef=field[i];
       	System.out.println(fieldRef.getType());
       	System.out.println(fieldRef.getModifiers());
       	System.out.println(fieldRef.getName());
       	
       }
       Method[] methodRef=ref.getMethods();
       System.out.println("*****");
       for(int i=0;i<methodRef.length;i++)
       {
       
       	Method methodsRef=methodRef[i];
       	System.out.println(methodsRef.getModifiers());
       	System.out.println(methodsRef.getName());
       	System.out.println(methodsRef.getParameterCount());
       	
       }
       
       Constructor[] constructorRef=ref.getConstructors();
       System.out.println("*************");
       for(int i=0;i<constructorRef.length;i++)
       {
       	Constructor constructorsRef=constructorRef[i];
       	System.out.println(constructorsRef.getModifiers());
       	System.out.println(constructorsRef.getName());
       	System.out.println(constructorsRef.getParameterCount());
       	
		
       }
		
	}

}
