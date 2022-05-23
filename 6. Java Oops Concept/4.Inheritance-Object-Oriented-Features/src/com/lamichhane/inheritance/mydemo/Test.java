package com.lamichhane.inheritance.mydemo;

public class Test implements B  {

	public static void main(String[] args) {
		Test t = new Test();
		t.m1();
	}

	@Override
	public void m1() {
	System.out.println("m1 from interface");
		
	}
	
	

}
