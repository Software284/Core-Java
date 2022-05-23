package com.lamichhane.hashCode.method;

public class RelationBetweenHashCodeToStringMethod {
	
	int i;
	RelationBetweenHashCodeToStringMethod(int i){
		this.i = i;
	}
	
	public int  hashCode() {
		return i;
	}

	public static void main(String[] args) {
		 
		RelationBetweenHashCodeToStringMethod obj1 = new RelationBetweenHashCodeToStringMethod(10);
		RelationBetweenHashCodeToStringMethod obj2 = new RelationBetweenHashCodeToStringMethod(100);
		System.out.println(obj1);
		System.out.println(obj2);

	}

}
