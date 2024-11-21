package com.programs;

import java.nio.channels.ClosedByInterruptException;

public class AutoBoxing3 {

	public static void main(String[] args) {

		byte g1 = 2;
		int marks = 90;
		double rate = 50.5;
		char name = 0;
		boolean flag = false;

		// unboxing means convert from object or class to primitive data type.
		Byte b1 = new Byte(g1);
		Integer i1 = new Integer(marks);
		Double r1 = new Double(rate);
		Character c1 = new Character(name);
		Boolean bb1 = new Boolean(flag);

		// this is unboxing.
		// we got the values from objects or classes back to primitive variables.
		byte byteBack = b1.byteValue();
		System.out.println(byteBack);

		int intBack = i1.intValue();
		System.out.println(intBack);

		double doubleBack = r1.doubleValue();
		System.out.println(doubleBack);

		char charBack = c1.charValue();
		System.out.println(charBack);

		boolean booleanBack = bb1.booleanValue();
		System.out.println(booleanBack);
	}

}
