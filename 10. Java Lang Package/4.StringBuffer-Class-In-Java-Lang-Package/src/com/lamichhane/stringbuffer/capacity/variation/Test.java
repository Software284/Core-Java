package com.lamichhane.stringbuffer.capacity.variation;

public class Test {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		sb.append("abcdefghijklmnop");
		System.out.println(sb.capacity());
		sb.append("q");
		System.out.println(sb.capacity());
	}

}
