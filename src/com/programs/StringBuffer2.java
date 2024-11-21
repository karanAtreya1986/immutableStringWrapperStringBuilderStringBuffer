package com.programs;

public class StringBuffer2 {

	public static void main(String[] args) {

		java.lang.StringBuffer sb = new java.lang.StringBuffer("abcde");

		// manipulate strings directly and original string is manipulated.
		sb.append(" hello guys");
		System.out.println(sb);

	}
}
