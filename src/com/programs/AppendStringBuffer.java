package com.programs;

public class AppendStringBuffer {

	public static void main(String[] args) {

		StringBuffer sb1 = new StringBuffer("abcdef");
		System.out.println(sb1);

		// appends at end of the first string.
		sb1.append("tiger");
		System.out.println(sb1);
	}

}
