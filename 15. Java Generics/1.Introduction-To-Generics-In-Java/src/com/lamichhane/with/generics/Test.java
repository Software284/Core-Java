package com.lamichhane.with.generics;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<String> l = new ArrayList<String>();
		l.add("ravi");
		l.add("durga");
		// l.add(new Integer(10));
		
		String s1 = l.get(0);
		String s2 = l.get(1);
		
		System.out.println(s1);
		System.out.println(s2);

	}

}
