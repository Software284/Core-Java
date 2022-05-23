package com.lamichhane.concat.operator.demo;

public class Test {

	public static void main(String[] args) {
		
		
		String a = "durga";
		int b=10,c=20,d=30;
		System.out.println(a+b+c+d); //durga102030
		System.out.println(b+c+d+a); //60durga
		System.out.println(b+c+a+d); //30durga30
		System.out.println(b+a+c+d); //10durga2030

	}

}
