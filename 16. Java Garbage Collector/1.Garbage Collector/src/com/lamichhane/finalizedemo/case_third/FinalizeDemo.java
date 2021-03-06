package com.lamichhane.finalizedemo.case_third;

public class FinalizeDemo {
		
	static FinalizeDemo s;

	public static void main(String[] args) throws InterruptedException {
		
		FinalizeDemo d = new FinalizeDemo();
		System.out.println(d.hashCode());
		d = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(d.hashCode());
		
		s = null;
		System.gc();
		Thread.sleep(100000);
		System.out.println("End of main");
	}
	
	public void finalize() {
		System.out.println("finalize method called");
		s = this;
	}

}
