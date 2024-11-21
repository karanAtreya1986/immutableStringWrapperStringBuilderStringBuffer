package com.programs;

public class StringBuilder3 {

	public static void main(String[] args) {

		java.lang.StringBuilder sb = new java.lang.StringBuilder("abcde");

		// same hash code because original string is manipulated.
		int i1 = sb.hashCode();
		System.out.println(i1);
		sb.append(" hello  guys ");
		int i2 = sb.hashCode();
		System.out.println(i2);

	}

}
