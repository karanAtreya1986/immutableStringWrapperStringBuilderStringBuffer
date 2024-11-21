package com.programs;

public class ReverseStringBuffer {

	public static void main(String[] args) {

		StringBuffer sb1 = new StringBuffer("abcdefghi jik");
		System.out.println(sb1);

		// prints string in reverse order.
		// all methods of string buffer and string builder return string buffer or
		// string builder only.
		StringBuffer sb2 = sb1.reverse();
		System.out.println(sb1); // original also reversed.
		System.out.println(sb2); // new one also reversed.

	}

}
