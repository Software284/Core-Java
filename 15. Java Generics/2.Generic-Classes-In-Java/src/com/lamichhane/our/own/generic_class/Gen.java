package com.lamichhane.our.own.generic_class;

public class Gen<T> {
	
	T obj;
	Gen(T obj){
		this.obj = obj;
	}
	
	public void show() {
		System.out.println(obj.getClass().getName());
	}
	
	public T getOb() {
		return obj;
	}
}
