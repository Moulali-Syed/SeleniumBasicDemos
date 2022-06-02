package collectionsFreamwork;

import java.util.Iterator;
import java.util.LinkedList;

public class CollectionsDemo6 {
	public static void main(String[] args) {

		//Declare Linked List
		LinkedList l =new LinkedList();
		
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		LinkedList<String> l2 = new LinkedList<String>();

		// add elements to linked list
		l.add("Apple");
		l.add("hello");
		l.add(12);
		l.add('A');
		l.add(true);
		l.add(null);

		System.out.println(l);

		System.out.println(l.size());

		// remove
		l.remove(2);
		System.out.println("AFter removing" + l);
		
		//remove by value
		l.remove(null);
		
		//insert in middle of linked list
		l.add(3,"java");
		System.out.println("After inserting"+l);
		
		//retriving from linkedlist
		l.get(0);//0 is index
		
		//replace
		l.set(1, 'x');
		
		//contains()
		l.contains("java");//returns boolean true or false based on presence
		
		//check empty
		l.isEmpty();//returns true or false
		
		//read linked list - for loop
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
			
		}
		
		for(Object e:l) {
			System.out.println(e);
		}
		
		//iterator
		Iterator it = l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}
}

/*
 * LinkedList implements List interface
 * 
 * LinkedList is a class implements methods from List and Dequeue
 * 
 * ArrayList: to retrieve frequently we can use arraylist not preferable for
 * insertion and deleltion - because if we want to do these operatiosn this
 * leads to shifting all elements
 * 
 * LinkedList: more number of insertion and deletion , use linked list not
 * preferable for retreving , all elements are in random order
 * 
 * List Dequeue \ / \ / Linked List
 * 
 * duplicate allowed insertion order preserved null allowed
 * 
 * every element is linked to other element
 * 
 * 
 * Methods available in LinkedList: add(object) add(index,object)
 * 
 * addAll(collection) remove(object) remove(index) removeAll(collection)
 * 
 * get(index) set(index,object)
 * 
 * collections class has methods sort(), shuffle() can be used in Linked List
 * 
 * specific to linked list: FILO - stack FIFO - queue addFirst(object)
 * addLast(object) removeFirst() removeLast() getFirst() getLast()
 * 
 */
