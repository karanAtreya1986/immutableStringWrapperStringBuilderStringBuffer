package com.programs;

public class StringImmutable6 {

	public static void main(String[] args) {
		String s1 = new String("abcd");
		int i1 = s1.hashCode();
		System.out.println("hash code is " + i1);
		System.out.println("string value is " + s1);

		// here string value will be changed.
		// this is the way to change immutable string.
		// assign to variable.
		s1 = s1.concat("hello");
		System.out.println("string value is " + s1);

		// hash code will also be different as new memory address assigned.
		int i2 = s1.hashCode();
		System.out.println("hash code is " + i2);

	}

}
