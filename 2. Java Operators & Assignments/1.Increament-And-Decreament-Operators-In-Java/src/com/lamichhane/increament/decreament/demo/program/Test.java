package com.lamichhane.increament.decreament.demo.program;

public class Test {

	public static void main(String[] args) {
		
		int x = 10;
		System.out.println("Pre-fix and Post-fix of ++x");
		int y = ++x;
		System.out.println("Value of y="+y);
		System.out.println("Value of x ="+x);
		
		System.out.println("Pre-fix and Post-fix of a++");
		int a = 10;
		int b = a++;
		System.out.println("Value of b="+b);
		System.out.println("Value of a ="+a);
		System.out.println();
		
		int c = 10;
		System.out.println("Pre-fix and Post-fix of --c");
		int d = --c;
		System.out.println("Value of d="+d);
		System.out.println("Value of c ="+c);
		
		System.out.println("Pre-fix and Post-fix of e--");
		int e = 10;
		int f = e--;
		System.out.println("Value of f="+f);
		System.out.println("Value of e="+e);
		System.out.println();

	}

}
