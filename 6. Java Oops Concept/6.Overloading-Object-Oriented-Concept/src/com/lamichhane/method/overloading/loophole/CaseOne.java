package com.lamichhane.method.overloading.loophole;

import com.lamichhane.method.overloading.Test;

public class CaseOne {
	
	public void m1(int i) {
		System.out.println("int arg method called");
	}
	
	public void m1(float f) {
		System.out.println("float arg method called");
	}

	public static void main(String[] args) {
		
		CaseOne one = new CaseOne();
		one.m1(10); // int-arg
		one.m1(10.5f); // float-arg 
		one.m1('a'); // int-arg
		one.m1(10l); // float-arg
		// one.m1(10.5); Compile time exception 
		// byte-short-char-> int -> long -> float -> double

	}

}
