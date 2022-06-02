package collectionsFreamwork;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class CollectionsDemo15 {
public static void main(String[] args) {
		
		LinkedList q = new LinkedList();
		q.add("A");
		q.add("B");
		q.add("N");
		q.offer("10");
		
		System.out.println(q);
		
		//get head element
		System.out.println(q.element());
		System.out.println(q.peek());
		
		
		//return and remove element
		System.out.println(q.remove());
		System.out.println(q.poll());
		
		//read all elements
		Iterator it = q.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		for(Object e : q) {
			System.out.println(e);
		}
		
	}
}
