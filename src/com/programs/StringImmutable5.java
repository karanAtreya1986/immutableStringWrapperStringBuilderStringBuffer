package com.programs;

public class StringImmutable5 {

	public static void main(String[] args) {
		String s1 = new String("abcd");
		int i1 = s1.hashCode();
		System.out.println("hash code is " + i1);
		System.out.println("string value is " + s1);

		// try replacing original string.
		s1.replaceAll("a", "tiger");
		// original string not changed as immutable.
		System.out.println("check if string changed " + s1);
		int i2 = s1.hashCode();

		// hash code will be same as original string not changed as its immutable.
		System.out.println("hash code is " + i2);
	}

}
