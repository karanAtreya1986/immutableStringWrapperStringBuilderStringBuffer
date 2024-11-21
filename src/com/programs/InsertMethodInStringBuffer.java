package com.programs;

public class InsertMethodInStringBuffer {

	public static void main(String[] args) {

		StringBuffer sb1 = new StringBuffer("abcd");
		System.out.println(sb1);

		// give the index where to insert.
		// index starts from zero.
		// second param is the string to insert.
		sb1.insert(2, "hello guys");
		System.out.println(sb1);
	}

}
