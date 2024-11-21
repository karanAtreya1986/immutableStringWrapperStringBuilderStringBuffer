package com.programs;

public class Unboxing {

	public static void main(String[] args) {

		// compile error when we write like this - The constructor Byte(int) is
		// undefined
//		Byte b2 = new Byte(10);

		// correct way to write.
		Byte b2 = new Byte((byte) 10);

		// converted from parent class to primitive type.
		// this is unboxing.
		byte b3 = b2.byteValue();

		System.out.println(b3);
	}

}
