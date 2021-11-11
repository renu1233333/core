package com.xworkz.objectoverride;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Shoe {

	private int size;
	private String color;
	private String brand;

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == null) {
			System.out.println("passing null reference");
			return false;
		}

		if (obj instanceof Shoe) {
			Shoe shoeRef = (Shoe) obj;
			String brandRef = shoeRef.brand;
			String colorRef = shoeRef.color;
			if (brand.equals(brandRef) && color.equals(colorRef)) {
				System.out.println("matched");
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Shoe shoe = new Shoe();
		Shoe shoe1 = new Shoe();
		shoe.setBrand("bata");
		shoe1.setBrand("bata");
		shoe.setColor("Black");
		shoe.setBrand("Black");

		System.out.println(shoe.hashCode());
		System.out.println(shoe.toString());
		System.out.println(shoe.equals(shoe1));

		Class ref = shoe.getClass();
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
