package com.lamichhhane.case_first;

import java.util.ArrayList;

public class Test {
	
	public static  void m1(ArrayList<String> l){
		l.add("A");
		l.add(null);
		// l.add(10);
	}

	public static void main(String[] args) {
		
		ArrayList<String> s = new ArrayList<String>();
		ArrayList<Integer> i = new ArrayList<Integer>();
		m1(s);
		// m1(i);

	}

}
