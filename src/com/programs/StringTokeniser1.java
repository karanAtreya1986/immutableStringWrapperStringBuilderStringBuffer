package com.programs;

import java.util.StringTokenizer;

public class StringTokeniser1 {

	// Breaks strings into tokens.
	// Give string to break and delimiter.

	public static void main(String[] args) {

		StringTokenizer st1 = new StringTokenizer("hi guys how are you", " ");
		while (st1.hasMoreTokens()) {
			String st2 = st1.nextToken();
			System.out.println(st2);
		}
	}

}
