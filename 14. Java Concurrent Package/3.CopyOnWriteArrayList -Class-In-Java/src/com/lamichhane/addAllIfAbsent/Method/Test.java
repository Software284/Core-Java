package com.lamichhane.addAllIfAbsent.Method;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test {

	public static void main(String[] args) {
		
		ArrayList I = new ArrayList();
		I.add("A");
		I.add("B");

		CopyOnWriteArrayList I1 = new CopyOnWriteArrayList();
		I1.add("A");
		I1.add("C");
		System.out.println(I1);
		I1.addAll(I);
		System.out.println(I1);

		ArrayList I2 = new ArrayList();
		I2.add("A");
		I2.add("D");
		I1.addAllAbsent(I2);
		System.out.println(I1);
	}

}
