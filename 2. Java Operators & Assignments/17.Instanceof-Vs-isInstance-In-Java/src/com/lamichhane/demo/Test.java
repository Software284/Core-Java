package com.lamichhane.demo;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Thread t = new Thread();
		System.out.println(Class.forName(args[0]).isInstance(t));

	}

}
