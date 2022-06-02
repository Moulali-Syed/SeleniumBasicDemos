package collectionsFreamwork;

import java.util.Iterator;
import java.util.PriorityQueue;

public class CollectionsDemo14 {

	public static void main(String[] args) {
		
		PriorityQueue<String> q = new PriorityQueue<String>();
		q.add("A");
		q.add("B");
		q.add("N");
		q.offer("A");
		
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

/*

Collections [Interface]----> Queue[Interface]  ---> Qequeue[interface] , BlockingQueue[interface],BlockingDeQueue[interface]
								|
							PriorityQueue(class),LinkedList(class)
							
linkedList implements list and queue interface
PriorityQueue(class),LinkedList(class)  implements Queue

we have group of elements which are prior to processing then we can use Queue
say i have so many mobile numbers, iwant to send sms , sms will be sent in order of queue concept

suppose i want to send email , to many mailids , here also prior to processing

queue follows firstInFirstOut[FIFO]
element inserted first , comes out first

we have 2 classes which implements Queue  - linkedList[also implements List] , priority Queue

LinkedList     PriorityQueue - insertionorder not preserved
 preserves insertion order , both allows duplicate
linked list allows heterogeneous data but priorityqueue doesnot allow heterogenous data

methods:
mainly we have 6 methods implemented from queue interface
1.add() - adds element at tail position , if insertion successful it returns true , if not it returns exception
2.offer() - adds element , successful returns true ,if not successful it returns false 
3.element() - returns head element from queue , if queue is empty then it returns execption
4.peek() - returns head element from queue , if queue is empty then it returns null
5.remove() - returns and remove element , if queue is empty then it returns execption
6.poll() - returns and remove element, if queue is empty then it returns null

*/