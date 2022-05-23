package com.lamichane.print.all.object.methods;

import java.lang.reflect.Method;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException {
		
		int count = 0;
		Class c = Class.forName("java.lang.Object");
		Method[] m = c.getDeclaredMethods();
		for(Method method:m) {
			count++;
			System.out.println(method.getName());
		}
		System.out.println("The number of methods="+count);
		
		

	}

}
