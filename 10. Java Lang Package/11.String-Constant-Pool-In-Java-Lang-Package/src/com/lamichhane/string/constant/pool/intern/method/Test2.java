package com.lamichhane.string.constant.pool.intern.method;

public class Test2 {

	public static void main(String[] args) {
		
		String s1 = new String("durga");
		String s2 = s1.concat("software");
		String s3 = s2.intern();
		System.out.println(s2 == s3);
		String s4 = "durgasoftware";
		System.out.println(s3 == s4);

	}

}
