package com.programs;

public class AutoBoxing {

	public static void main(String[] args) {

		byte b1 = 4;

		Byte b2 = new Byte(b1);

		// this is auto boxing.
		// wrap primitive to wrapper classes directly.

		// To get values, just pass object name of wrapper like collections. No need of
		// get() methods.
		System.out.println(b2);
	}

}
