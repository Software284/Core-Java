package com.lamichhane.equals.method;

public class ReferenceComparisonWithEqualsMethod {
	
	String name;
	int roll;
	
	ReferenceComparisonWithEqualsMethod(String name,int roll){
		this.name = name;
		this.roll = roll;
	}
	
public static void main(String[] args) {
		
		ReferenceComparisonWithEqualsMethod s1 = new ReferenceComparisonWithEqualsMethod("Mahesh",101);
		ReferenceComparisonWithEqualsMethod s2 = new ReferenceComparisonWithEqualsMethod("Akash",102);
		ReferenceComparisonWithEqualsMethod s3 = new ReferenceComparisonWithEqualsMethod("Mahesh",101);
		ReferenceComparisonWithEqualsMethod s4 = s1;
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));

	}
}
