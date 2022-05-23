package com.lamichhane.method.overriding.demo;

public class Test {

	public static void main(String[] args) {
		P p = new P();
		p.marry();
		
		C c = new C();
		c.marry();
		
		P p1 = new C();
		p1.marry();
		//at run time if marry method is overloaded then child class marry method will be invoked
		
		
		
		// C c1 = new P();

	}

}
