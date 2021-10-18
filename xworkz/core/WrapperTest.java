package com.xworkz.core;

public class WrapperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String is immutable
		String name = "Xworkz";
		String area = new String("BTM");
		String a = "Test";
		String b = "Test";
		b = "xworkz";
		System.out.println(a);
		// System.out.println("Test".toUpperCase());
		// System.out.println(a+" "+b);
//concat
		a = a.concat(b);
		System.out.println(a);

		String name1 = new String("Renu");
		String name2 = new String("Hadapad");
		System.out.println(name1 + " " + name2);

//charAt()
		String msg = "This code is encrypted";

		char ch = msg.charAt(5);// accessing value of index no 5
		System.out.println(ch);
		System.out.println(msg.charAt(0));// accessing first index value
		System.out.println(msg.charAt(msg.length() - 1));// accessing last index value
		System.out.println(msg.replace(" ", ""));// removing space
		// printing character presented at odd position
		System.out.println(msg.replace(" ", ""));
		for (int i = 0; i < msg.length(); i++) {
			if (i % 2 != 0) {
				System.out.println("odd index value " + msg.charAt(i));
			}
		}

		// finding and counting duplicate value
		int counter = 0;
		for (int i = 0; i < msg.length(); i++) {
			counter = 1;
			for (int j = i + 1; j < msg.length(); j++) {
				if (msg.charAt(i) == msg.charAt(j)) {
					counter++;
					System.out.println("duplicate character is " + msg.charAt(i) + " " + counter);

				}
			}
		}

//length()
		int length = msg.length();
		System.out.println(length);
//substring()
		String subName = msg.substring(4);
		System.out.println(subName);
		String subNameWithEndIndex = msg.substring(5, 9);
		System.out.println(subNameWithEndIndex);
		// string is palindrome or not

//contains()
		String warning = "access denied due to incorrect password";
		boolean warningRef = warning.contains("incorrect ");
		System.out.println(warningRef);
		System.out.println(warning.contains("den"));
//join()
		String date = String.join("/", "09", "10", "1998");
		System.out.println(date);

		String time = String.join(":", "10", "04", "32");
		System.out.println(time);
		String country = String.join("/", "India");
		System.out.println(country);

		String family = String.join("/", "father", "mother", "daughter", "son");
		System.out.println(family);
//equals()
		String firstName = "renu";
		String firstname = new String("Renu");
		System.out.println(firstName.equals(firstname));

		String number = "123";
		Integer num = new Integer(123);
		System.out.println(number.equals(num));
		String number1 = num.toString();
		System.out.println(number.equals(number1));

//isEmpty()
		String emptyString = "";
		System.out.println(emptyString.isEmpty());
		System.out.println(emptyString.length());

//concat()
		String instituteName = "xworkz";
		String areaName = " btm";
		instituteName = instituteName.concat(areaName);
		System.out.println(instituteName);

	}

}
