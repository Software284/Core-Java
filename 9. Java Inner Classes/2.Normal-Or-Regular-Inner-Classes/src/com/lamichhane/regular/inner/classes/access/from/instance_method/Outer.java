package com.lamichhane.regular.inner.classes.access.from.instance_method;

public class Outer {
	
	class Inner {
		public void m1() {
			System.out.println("Instance method inside inner classes");
		}
	}
	
	public void m2() {
		Inner i = new Inner();
		i.m1();
	}

	public static void main(String[] args) {
	
		Outer o = new Outer();
		o.m2();

	}

}
