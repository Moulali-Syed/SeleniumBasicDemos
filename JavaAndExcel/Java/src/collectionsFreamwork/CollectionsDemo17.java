package collectionsFreamwork;
import java.util.*;
import java.util.Map.Entry;
public class CollectionsDemo17 {

	public static void main(String[] args) {
		//Hashtable t = new Hashtable();//capacity is 11 , load factor is 0.75
//		Hashtable t = new(initialCapacity);//create hashtable object with some capacity
		
//		Hashtable t = new Hashtable(initialCapacity,loadFactor)
		
		Hashtable<Integer,String> t = new Hashtable<Integer,String>();
		
		t.put(101,"John");
		t.put(102, "David");
		t.put(103, "Smith");
//		t.put(null, "X"); // null pointer exception
//		t.put(104, null);//null pointer exception
		
		System.out.println(t);
		System.out.println(t.get(103));
		
		System.out.println(t.remove(103));
		System.out.println(t);
		
		t.containsKey(102);//true or false based on availability
		
		t.containsValue("David");//true or false based on availability
		
		t.isEmpty(); //returns true or false
		
		System.out.println(t.keySet());//returns keys
		System.out.println(t.values());//retruns all values
		
		for(int k:t.keySet()) {
			System.out.println(k+"  "+t.get(k));
		}
		
		//Entry specific methods
		for(Map.Entry entry:t.entrySet()) {
			System.out.println(entry.getKey() +" "+ entry.getValue());
		}
		
		//iterator()
		Set s = t.entrySet();
	Iterator it = s.iterator();
	while(it.hasNext()) {
		Map.Entry entry=(Entry)it.next();
		System.out.println(entry.getKey()+"  "+entry.getValue());
	}
	
	}
}

/*
 Map[interface] -- Hashmap,hashTable
 
 HashMap and HashTable both are classes
 
 data stored in form of key,value pairs in both
 underlying DS is HashTable for both , based on HashCode , in both insertion order is not preserved
 
 
 differences:
 HashTable is synchronized [if we access , at a time one thread is accessible]
 one thread allowed at a time
 
 HashMap is non synchronized, multiple threads can access same method
 
 HashTable is thread safe , HashMap is not thread safe
 HashTable performance is poor because of synchronized
 hashmap performance is faster because of non sync
 
 
 one Null key is accepted any number of nulls are accepted as values in HashMap
 HashTable doesnot allow null for key or value
 
 
 */
