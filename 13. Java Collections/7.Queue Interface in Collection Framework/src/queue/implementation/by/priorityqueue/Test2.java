package queue.implementation.by.priorityqueue;

import java.util.PriorityQueue;

public class Test2 {

	public static void main(String[] args) {
		
		PriorityQueue q = new PriorityQueue(15,new MyComparator2());
		q.offer("A");
		q.offer("Z");
		q.offer("L");
		q.offer("B");
		System.out.println(q);

	}

}
