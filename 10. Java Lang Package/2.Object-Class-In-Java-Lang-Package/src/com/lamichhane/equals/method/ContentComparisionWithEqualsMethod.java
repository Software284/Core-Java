package com.lamichhane.equals.method;

public class ContentComparisionWithEqualsMethod {
	
	String name;
	int roll;
	
	ContentComparisionWithEqualsMethod(String name,int roll){
		this.name = name;
		this.roll = roll;
	}
	
	public boolean equals(Object o) {
		ContentComparisionWithEqualsMethod oo = (ContentComparisionWithEqualsMethod)o;
		if((oo.name == name) && (oo.roll == roll)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		
		ContentComparisionWithEqualsMethod s1 = new ContentComparisionWithEqualsMethod("Mahesh",101);
		ContentComparisionWithEqualsMethod s2 = new ContentComparisionWithEqualsMethod("Akash",102);
		ContentComparisionWithEqualsMethod s3 = new ContentComparisionWithEqualsMethod("Mahesh",101);
		ContentComparisionWithEqualsMethod s4 = s1;
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));

	}

}
