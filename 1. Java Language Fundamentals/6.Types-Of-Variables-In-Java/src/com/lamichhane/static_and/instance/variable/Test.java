package com.lamichhane.static_and.instance.variable;

public class Test {
	
	static int x = 10;
	int y = 20;

	public static void main(String[] args) {
		
		Test t1 = new Test();
		t1.x = 8888;
		t1.y = 9999;
		
		Test t2 = new Test();
		System.out.println(t2.x+"..."+t2.y);

	}

}
