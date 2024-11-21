package com.programs;

import java.nio.channels.ClosedByInterruptException;

public class AutoBoxing5 {

	public static void main(String[] args) {
		
		//mixing auto boxing and unboxing.
		
		Integer i= new Integer(10);
		System.out.println(i);
		
//		//unbox
//		int i1=i.intValue()+10;
//		
//		//autobox
//		i=new Integer(i1);
//		
//		System.out.println(i);
		
		//clubbing lines 14 to 20.
		int i2=i.intValue()+10;
		System.out.println(new Integer(i2));
	}

}
