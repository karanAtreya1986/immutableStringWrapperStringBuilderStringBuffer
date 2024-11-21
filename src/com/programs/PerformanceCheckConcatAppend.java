package com.programs;

public class PerformanceCheckConcatAppend {

	static String concatWithString() {
		String s1 = "abcd";
		for (int i = 0; i < 10000; i++) {
			s1 = s1 + "xcbvnm,213123@#$#@$1";
		}
		return s1;
	}

	// to return string, we need to write return as s2.tostring()
	// will show in next example.
	static StringBuffer appendWithStringBuffer() {
		StringBuffer s2 = new StringBuffer("abcd");
		for (int i = 0; i < 10000; i++) {
			s2 = s2.append("zxcvbm324324#@$#@$34");
		}
		return s2;
	}

	// string faster than string buffer.
	// string is thread safe hence little slow.
	public static void main(String[] args) {
		long l1 = System.currentTimeMillis();
		concatWithString();
		System.out.println("time taken by string " + (System.currentTimeMillis() - l1));

		long l2 = System.currentTimeMillis();
		appendWithStringBuffer();
		System.out.println("time taken by string buffer is  " + (System.currentTimeMillis() - l1));
	}

}
