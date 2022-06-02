package collectionsFreamwork;

import java.util.*;

public class CollectionsDemo8 {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add("dog");
		l.add("cat");
		l.add("tom");
		l.add("jerry");

		System.out.println(l);

		l.addFirst("Lion");
		l.addLast("Deer");

		System.out.println(l);

		System.out.println(l.getFirst());

		System.out.println(l.getLast());
		
		l.removeFirst();
		System.out.println(l);
		
		l.removeLast();
		System.out.println(l);

	}
}
