package com.programs;

public class DeleteStringBuilder {

	public static void main(String[] args) {

		StringBuilder sb1 = new StringBuilder("abcdefghi jik");
		System.out.println(sb1);

		// give start index.
		// end index not considered.
		// all items in between the index removed.
		sb1.delete(3, 5);
		System.out.println(sb1);

	}

}
