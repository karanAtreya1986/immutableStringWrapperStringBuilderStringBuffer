package com.programs;

import java.nio.channels.ClosedByInterruptException;

public class AutoBoxing4 {

	public static void main(String[] args) {
		
		//wrapper classes are immutable.

		byte g1 = 2;
		int marks = 90;
		float price = 324.32434f;
		double rate = 50.5;
		long quantity=3432434L;
		char name = 98;
		boolean flag = false;

		//auto boxing.
		//convert to wrapper classes.
		
		Byte b1 = new Byte(g1);
		Integer i1 = new Integer(marks);
		Float f1 = new Float(price);
		Double d1 = new Double(rate);
		Long l1 = new Long(quantity);
		Character c1 = new Character(name);
		Boolean bb1 = new Boolean(flag);

		System.out.println(b1);
		System.out.println(i1);
		System.out.println(f1);
		System.out.println(d1);
		System.out.println(l1);
		System.out.println(c1);
		System.out.println(bb1);
	}

}
