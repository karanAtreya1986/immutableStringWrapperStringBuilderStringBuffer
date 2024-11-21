package com.programs;

import java.nio.channels.ClosedByInterruptException;

public class AutoBoxing2 {

	public static void main(String[] args) {

		byte g1 = 2;
		int marks = 90;
		double rate = 50.5;
		char name = 0;
		boolean flag = false;

		// auto boxing from primitive to objects or classes
		Byte b1 = new Byte(g1);
		Integer i1 = new Integer(marks);
		Double r1 = new Double(rate);
		Character c1 = new Character(name);
		Boolean bb1 = new Boolean(flag);

		System.out.println(b1);
		System.out.println(i1);
		System.out.println(r1);
		System.out.println(c1); // 0 is ascii code for blank, hence blank in output.
		System.out.println(bb1);
	}

}
