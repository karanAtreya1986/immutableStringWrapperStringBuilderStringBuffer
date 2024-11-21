package com.programs;

public class AppendStringBuilder {

	public static void main(String[] args) {

		StringBuilder sb1 = new StringBuilder("abcdef");
		System.out.println(sb1);

		// appends at end of the first string.
		sb1.append("tiger");
		System.out.println(sb1);
	}

}
