package com.lamichhane.wrapper.utility_class.valueof.method;

public class Test {

	public static void main(String[] args) {
		
		Integer i = new Integer("10");
		Double d = Double.valueOf(10);
		Boolean b = Boolean.valueOf("durga");
		
		
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(b);
		System.out.println();
		
		Integer i1 = Integer.valueOf("1111",2);
		System.out.println(i1);
		System.out.println();
		
		
		Integer x = Integer.valueOf(10);
		Double x1 = Double.valueOf(10.5);
		Character ch = Character.valueOf('a');
		Boolean bx = Boolean.valueOf(true); 
		
		System.out.println(x);
		System.out.println(x1);
		System.out.println(ch);
		System.out.println(bx);
		System.out.println();

	}

}
