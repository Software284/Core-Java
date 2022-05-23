package com.lamichhane.generic.area.to.non.generic.area;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<String> array_list = new ArrayList<String>();
		array_list.add("mahesh");
		array_list.add("sagar");
		// array_list.add(10); CE
		m1(array_list);
		System.out.println(array_list);
		//array_list.add(10); CE
		
		

	}
	
	public static void m1(ArrayList l) {
		l.add(10);
		l.add(10.5);
		l.add(true);
	}

}
