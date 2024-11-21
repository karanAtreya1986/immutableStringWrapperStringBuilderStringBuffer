package com.programs;

import java.nio.channels.ClosedByInterruptException;

public class Unboxing2 {

	public static void main(String[] args) {

		byte g1 = 2;
		int marks = 90;
		float price = 324.32434f;
		double rate = 50.5;
		long quantity = 3432434L;
		char name = 98;
		boolean flag = false;

		Byte b1 = new Byte(g1);
		Integer i1 = new Integer(marks);
		Float f1 = new Float(price);
		Double d1 = new Double(rate);
		Long l1 = new Long(quantity);
		Character c1 = new Character(name);
		Boolean bb1 = new Boolean(flag);

		// unboxing.
		// Getting primitive data from object.
		byte b1Returned = b1.byteValue();
		int i1Returned = i1.intValue();
		float f1Returned = f1.floatValue();
		double d1Returned = d1.doubleValue();
		long l1Returned = l1.longValue();
		char c1Returned = c1.charValue();
		boolean bb1Returned = bb1.booleanValue();

		System.out.println(b1Returned);
		System.out.println(i1Returned);
		System.out.println(f1Returned);
		System.out.println(d1Returned);
		System.out.println(l1Returned);
		System.out.println(c1Returned);
		System.out.println(bb1Returned);
	}

}
