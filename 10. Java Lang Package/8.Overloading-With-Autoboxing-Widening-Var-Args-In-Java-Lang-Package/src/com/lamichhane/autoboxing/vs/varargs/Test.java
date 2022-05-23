package com.lamichhane.autoboxing.vs.varargs;

public class Test {
	
	public static void m1(int... x) {
		System.out.println("Var Args Method");
	}
	
	public static void m1(Integer i) {
		System.out.println("Autoboxing");
	}

	public static void main(String[] args) {
		
		int x = 10;
		m1(x);

	}

}

