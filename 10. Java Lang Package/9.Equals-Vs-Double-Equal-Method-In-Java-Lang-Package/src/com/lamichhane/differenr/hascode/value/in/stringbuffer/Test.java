package com.lamichhane.differenr.hascode.value.in.stringbuffer;

public class Test {

	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer("durga");
		StringBuffer sb2 = new StringBuffer("durga");
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1.hashCode());
		System.out.println(sb1.hashCode());

	}

}
