package com.lamichhhane.case_fourth;

import java.util.ArrayList;

public class Test {
	
	public static void m1(ArrayList<? super Runnable> l){
		  l.add(new Thread());
		 // l.add(new Integer()); //invalid
		}

	public static void main(String[] args) {
	
		ArrayList<Runnable> a = new ArrayList<Runnable>();
		ArrayList<Object> b = new ArrayList<Object>();
		ArrayList<Integer> c = new ArrayList<Integer>();
		m1(a); //valid
		m1(b); //valid
		//m1(c) //invalid

	}

}
