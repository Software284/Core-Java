package com.lamichhane.method.overloading;

public class Test {
	
	public void m1() {
		System.out.println("no arg method called");
	}
	
	public void m1(int i) {
		System.out.println("int arg method called");
	}
	
	public void m1(double d) {
		System.out.println("double arg method called");
	}

	public static void main(String[] args) {
		
		Test t = new Test();
		t.m1();
		t.m1(10);
		t.m1(10.3);

	}

}
