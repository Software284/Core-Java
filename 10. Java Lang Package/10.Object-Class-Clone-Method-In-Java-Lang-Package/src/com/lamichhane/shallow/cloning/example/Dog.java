package com.lamichhane.shallow.cloning.example;

public class Dog implements Cloneable{
	
	int j;
	Cat c;
	Dog(int j,Cat c){
		this.j = j;
		this.c = c;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
}
