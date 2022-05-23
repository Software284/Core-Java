package com.lamichhane.our.own.generic_class;

public class Test {

	public static void main(String[] args) {
		
		Gen<String> s1 = new Gen<String>("mahesh");
		s1.show();
		System.out.println(s1.getOb());
		
		System.out.println();
		
		Gen<Integer> s2 = new Gen<Integer>(10);
		s2.show();
		System.out.println(s2.getOb());
		
		System.out.println();
		
		
		Gen<Double> s3 = new Gen<Double>(10.0);
		s3.show();
		System.out.println(s3.getOb());
		
			

	}

}
