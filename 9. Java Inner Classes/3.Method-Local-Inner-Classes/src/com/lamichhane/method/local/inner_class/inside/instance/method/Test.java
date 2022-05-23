package com.lamichhane.method.local.inner_class.inside.instance.method;

public class Test {
	
	public void m1() {
		class Inner {
			public void sum(int x,int y) {
				System.out.println("Sum ="+(x+y));
			}
		}
		
		Inner i = new Inner();
		i.sum(10, 33);
		i.sum(34, 34);
		i.sum(43, 43);
	}

	public static void main(String[] args) {
		
		Test t = new Test();
		t.m1();
	}

}
