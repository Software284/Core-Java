package com.lamichhane.method.overloading.loophole;

import com.lamichhane.method.overloading.Test;

public class CaseFour {
	
	public void m1(int x,float y) {
		System.out.println("int-float method called");
	}
	
	public void m1(float x,int y) {
		System.out.println("float-int  method called");
	}

	public static void main(String[] args) {
		
		CaseFour four = new CaseFour();
		four.m1(10, 10.2f); // int-float method
		four.m1(10.2f, 33); // float-int method
		// four.m1(10, 10); compile time error reference m1() is ambigious
		// four.m1(10.3, 10.4); method m1(float,float) not found
		

	}

}
