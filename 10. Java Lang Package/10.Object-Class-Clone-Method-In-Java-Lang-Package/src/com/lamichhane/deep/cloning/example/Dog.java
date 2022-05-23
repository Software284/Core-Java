package com.lamichhane.deep.cloning.example;

public class Dog implements Cloneable{
	
	int j;
	Cat c;
	Dog(int j,Cat c){
		this.j = j;
		this.c = c;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Cat c1 = new Cat(c.i);
		Dog d2 = new Dog(j,c1);
		return d2;
	}
	
	
}
