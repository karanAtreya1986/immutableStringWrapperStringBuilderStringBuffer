package com.programs;

public class StringImmutable {

	// String-
	// Is immutable class.
	// What are other immutable classes-
	// Wrapper classes, Locale, Etc.

	public static void main(String[] args) {
		String s1 = new String("abcd");
		System.out.println(s1);
		int i1 = s1.hashCode();
		System.out.println("og hash code " + i1);

		// try replacing value
		// original string doesnt change.
		// og hash code also doesnt change as string is same.
		s1.replace('a', 't');
		System.out.println(" --------- replace ----------- ");
		System.out.println(s1);
		int i2 = s1.hashCode();
		System.out.println("after replace hash code " + i2);

		// try concatenating value
		// original string doesnt change.
		// og hash code also doesnt change as string is same.
		s1.concat("tiger");
		System.out.println(" ---------- concat ------------");
		System.out.println(s1);
		int i3 = s1.hashCode();
		System.out.println("after concat hash code " + i3);
	}

}
