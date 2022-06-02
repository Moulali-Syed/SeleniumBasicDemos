package collectionsFreamwork;

import java.util.Collections;
import java.util.LinkedList;

public class CollectionsDemo7 {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();

		l.add("A");
		l.add("N");
		l.add("M");
		l.add("D");

		LinkedList new_l = new LinkedList();
		new_l.addAll(l);
		System.out.println(new_l);

		new_l.removeAll(l);
		System.out.println(new_l);

		// sort()
		System.out.println("BeforeSorting"+l);
		Collections.sort(l);
		System.out.println("After sorting"+l);
		
		//reverseSort
		Collections.sort(l, Collections.reverseOrder());
		System.out.println("reverse order "+l);
		
		Collections.shuffle(l);
	}
}
