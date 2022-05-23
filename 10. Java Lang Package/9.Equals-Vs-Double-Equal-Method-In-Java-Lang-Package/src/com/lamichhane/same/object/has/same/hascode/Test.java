package com.lamichhane.same.object.has.same.hascode;

public class Test {

	public static void main(String[] args) {
		
		String s1 = new String("durga");
		String s2 = new String("durga");
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

	}

}
