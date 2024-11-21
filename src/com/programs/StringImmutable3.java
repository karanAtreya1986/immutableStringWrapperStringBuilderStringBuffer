package com.programs;

public class StringImmutable3 {

	// how to check if strings do not point to same thing.
	// check hash code.

	// hash code will be the same as original string not changed.

	// hash code- Gives bucket number or memory address.

	// How to check if memory allocated or not-
	// Hash code is same, so no new memory allocated.

	public static void main(String[] args) {
		String s1 = new String("abcd");
		int i1 = s1.hashCode();
		System.out.println(i1);

		s1.replace('a', 't');
		int i2 = s1.hashCode();
		System.out.println(i2);

		s1.concat("********* tiger *********");
		int i3 = s1.hashCode();
		System.out.println(i3);
	}

}
