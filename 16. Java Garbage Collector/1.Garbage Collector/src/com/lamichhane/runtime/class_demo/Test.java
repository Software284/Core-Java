package com.lamichhane.runtime.class_demo;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		
		Runtime r = Runtime.getRuntime();
		System.out.println("Total Heap Memory="+r.totalMemory());
		System.out.println("Free Heap Memory="+r.freeMemory());
		System.out.println();
		//r.gc();
		
		for(int i = 1; i<= 10000; i++) {
			Date d = new Date();
			d = null;
		}
		
		System.out.println("Free Heap Memory="+r.freeMemory());
		r.gc();
		System.out.println("Free Heap Memory="+r.freeMemory());

	}

}
