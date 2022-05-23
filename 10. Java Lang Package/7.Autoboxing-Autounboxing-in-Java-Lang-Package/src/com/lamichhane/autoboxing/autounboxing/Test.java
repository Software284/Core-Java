package com.lamichhane.autoboxing.autounboxing;

public class Test {
	
	static Integer I = 10;

	public static void main(String[] args) {
		
		
		int i = I;
		m1(i);
	}
	
	public static void m1(Integer k) {
		int j = k;
		System.out.println(j);
	}

}
