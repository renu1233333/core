package com.xworkz.core;

import com.xworkz.jar.JarStarter;

public class WrapperStarter {

	public static void main(String[] args) {
		
	com.xworkz.jar.JarStarter jar=new JarStarter();
	String jarFileName=jar.name;
	System.out.println(jarFileName);
		

		String name="Xworkzeeeeee";// constant pool 
		boolean contain=name.contains("no");
		System.out.println("contains wo"+contain);
		
		String branch=new String("BTM");//instance
		boolean containsTM=branch.contains("TM");
		System.out.println(branch.contains("TM"));
		
		char[] chars= {'X','W','O','R','K','Z'};
		String convertedString=String.copyValueOf(chars);
		System.out.println(convertedString);
		
		String nagappa="Nagappa";
		String nagamma=new String("NAGAPPA");
		
		boolean same=nagappa.equals(nagamma);
		System.out.println("SAME :"+same);
		
		System.out.println("nagappa".equalsIgnoreCase("Nagappa"));
		// 10 methods 
		String place="Mysore";
		String  famousFor="Palace";
		String mysoreFamousFor=place.concat(famousFor);
		System.out.println(mysoreFamousFor);
		
		int index=name.indexOf('X');
		System.out.println(index);
		
		int indexFrom=name.indexOf('e',3);
		System.out.println(indexFrom);
		
		
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		
		
	String replaceString=	place.replace('s', 'k');
	System.out.println(replaceString);
	
	
	System.out.println(name.replaceFirst("eeeeee","xworkz"));

	System.out.println(name.replaceAll("work","w"));	
	
	String intro="My name is Renu Hadapad ";
	System.out.println(intro);
	System.out.println(intro.replaceAll(" ", ""));
	
	String[] introRef=intro.split(" ");
	System.out.println(introRef.length);
	System.out.println(introRef[0]);
	
	System.out.println(introRef[1]);
	System.out.println(introRef[2]);
	System.out.println(introRef[3]);
	System.out.println(introRef[4]);
	
	
	String trimName="    My name is xyz";
	System.out.println(trimName);
	String trimString="    My name is xyz".trim();
	System.out.println(trimString);
	
	String toStringRef=new String("XworkzBtm");
	System.out.println(toStringRef.toString());
	String firstName="Renu";
	String lastName=new String("Hadapad");
	String fullName=firstName.concat(lastName);
	System.out.println(fullName);
	
	System.out.println(lastName.endsWith("apad"));
	
System.out.println(firstName.isEmpty());	
System.out.println(intro.length());
System.out.println(intro.substring(3));
System.out.println(trimName.valueOf(false));
System.out.println(trimName.valueOf(4));
//System.out.println(intro.getChars(3, 10,chars , 4));
String koti=new String("manga");
System.out.println(koti);


	}

}
