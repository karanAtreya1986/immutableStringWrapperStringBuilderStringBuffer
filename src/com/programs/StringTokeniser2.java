package com.programs;

import java.util.StringTokenizer;

public class StringTokeniser2 {

	// if you give the third parameter which is boolean you can know the delimiter
	// on which string is broken.
	// this will also print the delimiter.
	public static void main(String[] args) {

//		StringTokenizer st1 = new StringTokenizer("hi guys how are you", " ", true);
//		while (st1.hasMoreTokens()) {
//			String st2 = st1.nextToken();
//			System.out.println(st2);
//		}

		// give false and it is as good as not given.
		StringTokenizer st1 = new StringTokenizer("hi guys how are you", " ", false);
		while (st1.hasMoreTokens()) {
			String st2 = st1.nextToken();
			System.out.println(st2);
		}
	}

}
