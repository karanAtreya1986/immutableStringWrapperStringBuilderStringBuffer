package com.programs;

public class PerformanceCheckConcatAppend2 {

	static String concatWithString() {
		String s1 = "abcd";
		for (int i = 0; i < 10000; i++) {
			s1 = s1 + "xcbvnm,213123@#$#@$1";
		}
		return s1;
	}

	// how to make string buffer return string.
	// To string will convert the object reference to human readable string format,
	// else we get memory address.
	static String appendWithStringBuffer() {
		StringBuffer s2 = new StringBuffer("abcd");
		for (int i = 0; i < 10000; i++) {
			s2 = s2.append("zxcvbm324324#@$#@$34");
		}
		return s2.toString();
	}

	// Instead of + for concat in string, we can use the concat method also of
	// string.
	public static void main(String[] args) {
		long l1 = System.currentTimeMillis();
		concatWithString();
		System.out.println("time taken by string " + (System.currentTimeMillis() - l1));

		long l2 = System.currentTimeMillis();
		appendWithStringBuffer();
		System.out.println("time taken by string buffer is  " + (System.currentTimeMillis() - l1));
	}

}
