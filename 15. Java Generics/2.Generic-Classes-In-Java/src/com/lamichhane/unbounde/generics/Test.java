package com.lamichhane.unbounde.generics;

public class Test<T extends Number> {
	T t;
	Test(T t){
		this.t= t;	}
	
	public T getVal() {
		return t;
	}

	public static void main(String[] args) {
		
		
		Test<Integer> i = new Test<Integer>(10);
		Test<Double> d = new Test<Double>(10.4);
		// Test<String> s = new Test<String>("heheh");
		System.out.println(i.getVal());
		System.out.println(d.getVal());

	}

}
