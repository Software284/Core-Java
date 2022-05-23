package com.lamichhane.method.overloading.loophole;

import com.lamichhane.method.overloading.Test;

public class CaseFive {
	
	public void m1(int x) {
		System.out.println("int method called");
	}
	
	public void m1(int... x) {
		System.out.println("var args  method called");
	}

	public static void main(String[] args) {
		
		CaseFive five = new CaseFive();
		five.m1(); // var args method
		five.m1(10,20); // var args metod
		five.m1(10); // int method
		// if other int method not found then only var args method gets the chance
		
	
		

	}

}
