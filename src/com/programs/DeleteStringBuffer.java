package com.programs;

public class DeleteStringBuffer {

	public static void main(String[] args) {

		StringBuffer sb1 = new StringBuffer("abcdefghi jik");
		System.out.println(sb1);

		// give start index.
		// end index not considered.
		// all items in between the index removed.
		sb1.delete(3, 5);
		System.out.println(sb1);

	}

}
