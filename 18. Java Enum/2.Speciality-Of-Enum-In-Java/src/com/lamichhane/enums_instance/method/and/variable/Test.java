package com.lamichhane.enums_instance.method.and.variable;

public class Test {

	public static void main(String[] args) {
	
		Beer[] arr = Beer.values();
		for(Beer b : arr) {
			System.out.println(b+"..."+b.getPrices());
		}

	}

}
