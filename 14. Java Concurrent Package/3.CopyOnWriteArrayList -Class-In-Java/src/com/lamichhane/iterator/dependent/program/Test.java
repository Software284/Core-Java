package com.lamichhane.iterator.dependent.program;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test {

	public static void main(String[] args) {
		
		CopyOnWriteArrayList list = new CopyOnWriteArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		Iterator itr = list.iterator();
		list.add("D");
		while(itr.hasNext()) {
			String s = (String)itr.next();
			System.out.println(s);
		}

	}

}
