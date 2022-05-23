package com.lamichhane.varargs.sum.program;

public class Test {
	
	public static void sum(int... x) {
		int total = 0;
		for(int x1: x) {
			total+=x1;
		}
		
		System.out.println("Sum="+total);
	}

	public static void main(String[] args) {
		
		sum();
		sum(10,20);
		sum(10,20,30);
		sum(10,20,30,40);

	}

}
