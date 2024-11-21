package com.programs;

public class StringBuilder11 {

	public static void main(String[] args) {

		java.lang.StringBuilder sb = new java.lang.StringBuilder("abcde");
		// can directly print like collections.
		// value displayed not memory address.
		System.out.println(sb);

		// tostring() just to ensure that we print only values, not mandatory.
		String s1 = sb.toString();
		System.out.println(s1);
	}

}
