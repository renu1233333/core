package com.xworkz.objectoverride;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class IceCreamStarter {

	public static void main(String[] args) {
		IceCream cream = new IceCream();
		IceCream cream2 = new IceCream();
		System.out.println(cream.toString());
		Object cream1 = new Object();
		System.out.println(cream1);

		System.out.println(cream.hashCode());
		if (cream2 != null) {
			System.out.println(cream2.hashCode());
		}

		cream.setName("chacobar");
		cream2.setName("chacobar");

		cream.setPrice(23.5f);
		cream2.setPrice(23.5f);
		System.out.println(cream.equals(cream2));

		Class ref = cream.getClass();
		System.out.println(ref);
		System.out.println(ref.getSimpleName());
		System.out.println(ref.getModifiers());
		System.out.println();

		Field[] field = ref.getFields();
		System.out.println(field.length);
		System.out.println("***");
		for (int i = 0; i < field.length; i++) {

			Field fieldRef = field[i];
			System.out.println(fieldRef.getType());
			System.out.println(fieldRef.getModifiers());
			System.out.println(fieldRef.getName());

		}
		Method[] methodRef = ref.getMethods();
		System.out.println("*****");
		for (int i = 0; i < methodRef.length; i++) {

			Method methodsRef = methodRef[i];
			System.out.println(methodsRef.getModifiers());
			System.out.println(methodsRef.getName());
			System.out.println(methodsRef.getParameterCount());

		}

		Constructor[] constructorRef = ref.getConstructors();
		System.out.println("*************");
		for (int i = 0; i < constructorRef.length; i++) {
			Constructor constructorsRef = constructorRef[i];
			System.out.println(constructorsRef.getModifiers());
			System.out.println(constructorsRef.getName());
			System.out.println(constructorsRef.getParameterCount());

		}

	}

}
