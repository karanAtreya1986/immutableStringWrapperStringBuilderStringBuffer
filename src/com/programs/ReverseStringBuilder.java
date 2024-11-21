package com.programs;

public class ReverseStringBuilder {

	public static void main(String[] args) {

		StringBuilder sb1 = new StringBuilder("abcdefghi jik");
		System.out.println(sb1);

		// prints string in reverse order.
		// all methods of string buffer and string builder return string buffer or
		// string builder only.
		StringBuilder sb2 = sb1.reverse();
		System.out.println(sb1); // original also reversed.
		System.out.println(sb2); // new one also reversed.

	}

}
