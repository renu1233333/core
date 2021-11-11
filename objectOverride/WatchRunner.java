package com.xworkz.objectoverride;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.xworkz.objectoverride.constants.WatchType;

public class WatchRunner {

	public static void main(String[] args) {
		Watch watch = new Watch();
		System.out.println(watch.toString());
		System.out.println(watch);

		String convertedString = watch.toString();
		System.out.println(convertedString);

		Watch watch1 = new Watch();
		System.out.println(watch1);
		System.out.println(watch1.hashCode());

		System.out.println(watch.hashCode());
		System.out.println(watch.getClass());

		watch.setBrandName("sony");
		watch1.setBrandName("sony");
		watch1.setType(WatchType.ANALOG);
		watch.setType(WatchType.ANALOG);
		System.out.println(watch.equals(watch1));

		Class ref = watch.getClass();
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
