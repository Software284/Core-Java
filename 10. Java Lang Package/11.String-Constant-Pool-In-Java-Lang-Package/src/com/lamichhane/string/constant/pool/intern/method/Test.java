package com.lamichhane.string.constant.pool.intern.method;

public class Test {

	public static void main(String[] args) {
		
		String s1 = new String("durga");
		String s2 = s1.intern();
		System.out.println(s1 == s2);
		String s3 = "durga";
		System.out.println(s2 == s3);

	}

}
