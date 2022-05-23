package com.lamichhane.method.overloading.loophole;

import com.lamichhane.method.overloading.Test;

public class CaseThree {
	
	public void m1(String s) {
		System.out.println("string arg method called");
	}
	
	public void m1(StringBuffer st) {
		System.out.println("string buffer arg method called");
	}

	public static void main(String[] args) {
		
		CaseThree two = new CaseThree();
		two.m1("mahesh"); //string arg
		two.m1(new StringBuffer("mahesh")); // object arg
		// two.m1(null); // m1 is abmigious compile time exception
		

	}

}
