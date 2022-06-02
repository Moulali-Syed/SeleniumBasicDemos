package collectionsFreamwork;

import java.util.HashSet;
import java.util.Iterator;

public class CollectionsDemo9 {

	public static void main(String[] args) {

		// create HashSet
		HashSet hs = new HashSet();// default capacity is 16, load factor 0.75
		HashSet hs1 = new HashSet(100);// initial capacity
		HashSet hs2 = new HashSet(100, (float) 0.90); // initialcapacity ,load factor
		HashSet<Integer> hs3 = new HashSet<Integer>();

		// add obejects to HashSet
		hs.add("A");
		hs.add("Kakd");
		hs.add(1);
		hs.add(true);
		hs.add("hello");
		hs.add(null);

		System.out.println(hs);// insertion order is not preserved

		// remove
		hs.remove(16.4);
		System.out.println(hs);

		// contains()
		hs.contains("hello");// true or false

		hs.isEmpty();

		// read - foreach
		for (Object e : hs) {
			System.out.println(e);
		}

		Iterator it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}

/*
 * 
 * Collection --> Set[interface} --> HashSet, LinkedHashSet
 * 
 * duplicates not allowed , insertion order not maintained elements inserted
 * using a mechansim called hashcode thats y searching of elements in very fast
 * no concept of index , arranged randomly heterogeneous data is allowed null is
 * also allowed
 * 
 * HashSet hs = new HashSet(); initial size is 16 locations also we have load
 * factor/fill ratio - 0.75
 * 
 * in case of array list ArrayList ar = new ArrayList(); by default size is 10
 * when i add 11th element , it will create a new arrayList and copy all the 10
 * elements and 11th element is added to it now ar will point to the new
 * ArrayList and the old will be left for garbage collection
 * 
 * In case of hashset 16 locations will be there, 0.75 is load factor in case of
 * arrayList once 10 elements filled , for 11th element it creates a new
 * arrayList but in HashSet as soon as 75% of the set is filled , it will create
 * a new set with 16+new object location , then the hs will refer this new
 * object and the old one will be left for garbage collection this is called
 * load factor/fill ratio
 * 
 * how can we configure initial size and load factor we define hashset as below
 * HashSet hs = new HashSet(100); --> load factor is 0.75 HashSet hs = new
 * HashSet(100,0.95);
 * 
 * restrict datatype HashSet<Integer> hs = new HashSet<Integer>();
 * 
 * 
 * methods available in HashSet: no special methods in HashSet, whatever present
 * in Set are only implemented add(value) addAll(collection) remove(value)
 * removeAll(collection) contains(object) containsAll(collection) isEmpty()
 * 
 * 
 * sort and shuffle is not directly possible, only possible if all elements are
 * arranged sequential if we want to sort we must convert HashSet to arrayList
 * then we can sort
 * 
 */
