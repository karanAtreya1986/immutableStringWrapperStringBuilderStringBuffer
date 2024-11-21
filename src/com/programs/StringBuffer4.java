package com.programs;

public class StringBuffer4 {

	public static void main(String[] args) {

		java.lang.StringBuffer sb = new java.lang.StringBuffer("abcde");

		int i1 = sb.hashCode();
		System.out.println(sb);
		System.out.println(i1);

		System.out.println(" -------- After replacement -------- ");
		sb.replace(2, 4, "hello");

		int i2 = sb.hashCode();
		System.out.println(sb);
		System.out.println(i2);

		// We get same hash code because no new memory allocated for string buffer.

		// In replace, we give the start index, end index and the new value to be
		// replaced in these indexes. end index is not considered.

	}
}
