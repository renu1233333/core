package com.xworkz.objectoverride;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class CityRunner {

	public static void main(String[] args) {
		City city = new City();
		City city1 = new City();
		System.out.println(city.hashCode());
		System.out.println(city.toString());
		city.setStateName("karnataka");
		city.setCountryName("india");
		city1.setCountryName("india");
		city1.setStateName("karnataka");
		System.out.println(city.equals(city1));

		Class ref = city.getClass();
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
