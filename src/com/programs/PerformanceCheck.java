package com.programs;

public class PerformanceCheck {

	// string versus string buffer versus string builder

	public static void main(String[] args) {

		// String best, then string builder then string buffer.

		long t;

		String s1 = "";
		t = System.currentTimeMillis();

		for (int i = 100000000; i >= 0; i--) {
			s1.concat("hello ");
		}
		System.out.println("time taken by string in ms is " + (System.currentTimeMillis() - t));

		StringBuffer sb = new StringBuffer();
		t = System.currentTimeMillis();

		for (int i = 100000000; i >= 0; i--) {
			sb.append(" hello ");
		}
		System.out.println("time taken by string buffer in ms is " + (System.currentTimeMillis() - t));

		StringBuilder sb1 = new StringBuilder();
		t = System.currentTimeMillis();

		for (int i = 100000000; i >= 0; i--) {
			sb1.append(" hello ");
		}
		System.out.println("time taken by string builder in ms is " + (System.currentTimeMillis() - t));

	}

}
