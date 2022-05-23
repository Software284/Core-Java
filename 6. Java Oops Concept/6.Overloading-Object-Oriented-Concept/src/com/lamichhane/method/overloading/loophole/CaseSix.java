package com.lamichhane.method.overloading.loophole;

import com.lamichhane.method.overloading.Test;
class Animal{
	
}

class Monkey extends Animal{

}
public class CaseSix {
	
	public void m1(Animal a) {
		System.out.println("animal method called");
	}
	
	public void m1(Monkey m) {
		System.out.println("monkey  method called");
	}

	public static void main(String[] args) {
		
		CaseSix six = new CaseSix();
		Animal a1 = new Animal();
		Monkey m1 = new Monkey();
		six.m1(a1); // animal method
		six.m1(m1); // monkey method 
		Animal a2 = new Monkey();
		six.m1(a2); // monkey method 
		
		
	
		

	}

}
