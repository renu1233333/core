package com.xworkz.objectoverride;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.xworkz.objectoverride.constants.HeadSetType;

public class HeadSetRunner {

	public static void main(String[] args) {
		HeadSet set = new HeadSet();

		HeadSet set1 = new HeadSet();
		System.out.println(set.toString());
		System.out.println(set.hashCode());

		set.setName("Lenovo IdeaPad Gaming");
		set.setType(HeadSetType.WATERPROOF);

		set1.setName("Lenovo IdeaPad Gaming");
		set1.setType(HeadSetType.WATERPROOF);
		System.out.println(HeadSetType.WATERPROOF.age);

		for (HeadSetType typeSet : HeadSetType.values()) {
			System.out.println(typeSet.age);
		}

		System.out.println();

		System.out.println(set.equals(set1));

		Class ref = set.getClass();
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
