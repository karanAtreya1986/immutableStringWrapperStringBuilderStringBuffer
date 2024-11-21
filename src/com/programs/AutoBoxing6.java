package com.programs;

import java.nio.channels.ClosedByInterruptException;

public class AutoBoxing6 {

	public static void main(String[] args) {

		// sample example two

		Integer i = new Integer(10);
		System.out.println(i);

		// call modify method and check if value of "i" is changed
		// its not changed because wrapper is also immutable.
		// to change assign to another variable.
		// will see another problem for that.
		modify(i);
		System.out.println(i);

	}

	static int modify(Integer i1) {
		i1 = i1 + 1;
		return i1;
	}
}
