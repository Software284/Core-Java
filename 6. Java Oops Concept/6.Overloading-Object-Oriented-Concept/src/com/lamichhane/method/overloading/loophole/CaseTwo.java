package com.lamichhane.method.overloading.loophole;

import com.lamichhane.method.overloading.Test;

public class CaseTwo {
	
	public void m1(String s) {
		System.out.println("string arg method called");
	}
	
	public void m1(Object o) {
		System.out.println("object arg method called");
	}

	public static void main(String[] args) {
		
		CaseTwo two = new CaseTwo();
		two.m1("mahesh"); //string arg
		two.m1(new Object()); // object arg
		two.m1(null); // string arg called
		

	}

}
