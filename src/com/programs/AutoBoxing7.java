package com.programs;

import java.nio.channels.ClosedByInterruptException;

public class AutoBoxing7 {

	public static void main(String[] args) {

		// sample example two

		Integer i = new Integer(10);
		System.out.println(i);

		// call modify method and check if value of "i" is changed
		// i value is now changed as we reassigned it.
		int i3=modify(i);
		System.out.println(i3);

	}

	static int modify(Integer i1) {
		i1 = i1 + 1;
		return i1;
	}
}
