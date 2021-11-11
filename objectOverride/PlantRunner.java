package com.xworkz.objectoverride;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PlantRunner {

	public static void main(String[] args) {
		String name = "xworkz";
		Plant plant = new Plant();
		Plant plant1 = new Plant();
		System.out.println(plant);
		System.out.println(plant1);
		System.out.println(plant.toString());

		System.out.println(plant1.hashCode());

		plant.setName("mango");
		plant1.setName("mango");
		// plant.setLifeSpan(89);
		plant1.setLifeSpan(89);
		System.out.println(plant.equals(plant1));

		Class ref = plant.getClass();
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
