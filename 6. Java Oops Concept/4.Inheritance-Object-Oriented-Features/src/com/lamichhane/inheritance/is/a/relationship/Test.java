package com.lamichhane.inheritance.is.a.relationship;

public class Test {

	public static void main(String[] args) {
		
	
	
		P p = new P();
		p.m1();
		// p.m2();
		
		C c = new C();
		c.m1();
		c.m2();
		
		P p1 = new C();
		p1.m1();
		// p1.m2();
		
//		C c1 = new P();
		
		
		
		

	}

}
