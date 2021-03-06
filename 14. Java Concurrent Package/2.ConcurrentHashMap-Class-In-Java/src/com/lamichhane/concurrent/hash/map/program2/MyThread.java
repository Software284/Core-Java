package com.lamichhane.concurrent.hash.map.program2;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
class MyThread extends Thread {

	static ConcurrentHashMap m = new ConcurrentHashMap();
	public void run() {
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			
		}
		System.out.println("Child Thread Updating Map");
		m.put(103, "C");
	}
	
	public static void main(String args[]) throws InterruptedException {
		m.put(101, "A");
		m.put(102, "B");
		MyThread t = new MyThread();
		t.start();
		Set s = m.keySet();
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			Integer i1 = (Integer) itr.next();
			System.out.println("Main Thread iterating and Current Entry is:"+i1+"..."+m.get(i1));
			Thread.sleep(3000);
		}
		System.out.println(m);
	
	}
}
