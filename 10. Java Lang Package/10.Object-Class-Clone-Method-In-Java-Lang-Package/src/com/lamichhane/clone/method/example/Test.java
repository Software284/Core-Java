package com.lamichhane.clone.method.example;

public class Test implements Cloneable{
	
	int i = 20;
	int j = 30;

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Test t = new Test();
		Test t2 = (Test)t.clone();
		t2.i = 200;
		t2.j = 300;
		
		System.out.println("Orginal Object I Value = "+t.i);
		System.out.println("Orginal Object J Value = "+t.j);
		System.out.println();
		System.out.println("Duplicates Object I Value = "+t2.i);
		System.out.println("Duplicates Object J Value = "+t2.j);
	
		

	}

}
