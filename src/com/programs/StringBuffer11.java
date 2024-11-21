package com.programs;

public class StringBuffer11 {

	// Mutable classes-
	// Stringbuffer, Stringbuilder
	// String buffer- Synchronised api, so thread-safe. Little slow.
	// Objects can be altered.
	// String builder-Faster, since non synchronised and so non thread safe.

	public static void main(String[] args) {

		java.lang.StringBuffer sb = new java.lang.StringBuffer("abcde");

		// directly printing string buffer gives value not the memory address.
		// same like collections, no need to worry about memory address.
		System.out.println(sb);

		// tostring() also does the same job, this is written so we can absolutely
		// ensure no memory address is printed.
		String s1 = sb.toString();
		System.out.println(s1);

	}

	
}
