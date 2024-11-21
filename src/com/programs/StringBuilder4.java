package com.programs;

public class StringBuilder4 {

	public static void main(String[] args) {

		java.lang.StringBuilder sb = new java.lang.StringBuilder("abcde");

		int i1 = sb.hashCode();
		System.out.println(i1);
		System.out.println(sb);

		System.out.println(" ------- after replacement ------- ");

		//// We get same hash code because no new memory allocated for string buffer.

		// In replace, we give the start index, end index and the new value to be
		// replaced in these indexes. end index is not considered.

		sb.replace(1, 3, "hello guys");
		int i2 = sb.hashCode();
		System.out.println(i2);
		System.out.println(sb);

	}

}
