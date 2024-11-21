package com.programs;

public class StringBuilder2 {

	public static void main(String[] args) {

		java.lang.StringBuilder sb = new java.lang.StringBuilder("abcde");

		// original string is manipulated in this also.
		sb.append(" hello  guys ");
		System.out.println(sb);
	}

}
