package com.lamichhane.getClass.method;

import java.lang.reflect.Method;

public class Test {

	public static void main(String[] args) {
		
		Object o = new String("durga");
		Class c = o.getClass();
		System.out.println("Fully Qualified Name="+c.getName());
		Method[] m = c.getDeclaredMethods();
		for(Method m1:m) {
			System.out.println(m1.getName());
		}

	}

}
