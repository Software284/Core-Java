package com.lamichhane.regular.inner.classes.access.from.static_method;

public class Outer {
	
	class Inner {
		public void m1() {
			System.out.println("Instance method inside inner classes");
		}
	}

	public static void main(String[] args) {
	
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		i.m1();
		// we can also write
		// Outer.Inner i = new Outer().new Inner();
		//new Outer().new Inner().m1();

	}

}
