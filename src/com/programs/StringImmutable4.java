package com.programs;

public class StringImmutable4 {

	// hash code will be different because every string stored in separate variable.
	// so this is the only way we can make the string as a mutable type.

	public static void main(String[] args) {
		String s1 = new String("abcd");
		int i1 = s1.hashCode();
		System.out.println(i1);

		String s2 = s1.replace('a', 't');
		int i2 = s2.hashCode();
		System.out.println(i2);

		String s3 = s1.concat("********* tiger *********");
		int i3 = s3.hashCode();
		System.out.println(i3);
	}

}
