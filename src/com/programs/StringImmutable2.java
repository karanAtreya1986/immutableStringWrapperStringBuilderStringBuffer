package com.programs;

public class StringImmutable2 {

	// how to make string mutable
	// just assign to another variable

	public static void main(String[] args) {
		String s1 = new String("abcd");
		System.out.println(s1);

		String s2 = s1.replace('a', 't');
		System.out.println(" --------- replace ----------- ");
		System.out.println(s2);

		String s3 = s1.concat("********* tiger *********");
		System.out.println(" ---------- concat ------------");
		System.out.println(s3);
	}

}
