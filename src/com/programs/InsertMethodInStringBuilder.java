package com.programs;

public class InsertMethodInStringBuilder {

	public static void main(String[] args) {

		StringBuilder sb1 = new StringBuilder("abcd");
		System.out.println(sb1);

		// give the index where to insert.
		// index starts from zero.
		// second param is the string to insert.
		sb1.insert(2, "hello guys");
		System.out.println(sb1);
	}

}
