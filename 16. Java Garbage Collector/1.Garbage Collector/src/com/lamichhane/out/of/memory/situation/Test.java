package com.lamichhane.out.of.memory.situation;

public class Test {
	
	public static int count = 0;

	public static void main(String[] args) {
		
		for(int i = 0; i <= 1000000; i++) {
			Test t = new Test();
			t=null;
		}
		System.out.println("End of main");

	}
	
	public void finalize() {
		++count;
		System.out.println("finalize method called:"+count);
	}

}
