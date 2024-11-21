package com.programs;

public class ReplaceInStringBuilder {

	public static void main(String[] args) {

		StringBuilder sb1 = new StringBuilder("abcdefghi jik");
		System.out.println(sb1);

		// start index, end index and string to replace.
		// index starts from zero.
		// end index is not considered.

		sb1.replace(3, 5, "hello guys");
		System.out.println(sb1);

	}

}