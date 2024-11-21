package com.programs;

public class StringBuffer3 {

	public static void main(String[] args) {

		java.lang.StringBuffer sb = new java.lang.StringBuffer("abcde");

		// hash code remains the same because original string is manipulated.
		int i1 = sb.hashCode();
		System.out.println(i1);
		sb.append(" hello guys");
		int i2 = sb.hashCode();
		System.out.println(i2);

	}
}
