package com.programs;

import java.util.StringTokenizer;

public class StringTokeniser3 {

	// we can break strings using any damn delimiter in the world.

	public static void main(String[] args) {

//		StringTokenizer st1 = new StringTokenizer("hi guys 5 how are you", "5", true);
//		while (st1.hasMoreTokens()) {
//			String st2 = st1.nextToken();
//			System.out.println(st2);
//		}

//		StringTokenizer st1 = new StringTokenizer("hi guys 5 how are you", "h", true);
//		while (st1.hasMoreTokens()) {
//			String st2 = st1.nextToken();
//			System.out.println(st2);
//		}

		StringTokenizer st1 = new StringTokenizer("hi guys % & * )5 how are you", "%", true);
		while (st1.hasMoreTokens()) {
			String st2 = st1.nextToken();
			System.out.println(st2);
		}
	}

}
