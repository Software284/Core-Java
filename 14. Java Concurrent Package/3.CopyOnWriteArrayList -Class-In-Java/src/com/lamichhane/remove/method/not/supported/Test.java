package com.lamichhane.remove.method.not.supported;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test {

	public static void main(String[] args) {
		
		CopyOnWriteArrayList list = new CopyOnWriteArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		System.out.println(list);
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			String s = (String)itr.next();
			if(s.equals("D")) {
				itr.remove();
			}
		}
	}

}
