package collectionsFreamwork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionsDemo16 {

	public static void main(String[] args) {
		//HashMap m = new HashMap();
		HashMap<Integer,String> m = new HashMap<Integer,String>();
		
		m.put(101, "John");
		m.put(102, "David");
		m.put(103, "Scott");
		m.put(104, "Mary");
		m.put(105, "Tye");
		m.put(103, "X");// will not get added because key is already present
		m.put(106, "David");
		
		System.out.println(m);
		
		System.out.println(m.get(105)); //Tye
		
		m.remove(106); //remove pair from hashmap
		System.out.println(m);
		
		System.out.println(m.containsKey(101));
		System.out.println(m.containsKey(106));
		
		System.out.println(m.containsValue("Mary"));
		
		System.out.println(m.isEmpty());
		
		System.out.println(m.keySet());//returns all keys as Set
		
		for(int i : m.keySet()) {
			System.out.println(i);
		}
		
		System.out.println(m.values());//returns all values as collection
		for(Object i:m.values()) {
			System.out.println(i);
		}
		
		System.out.println(m.entrySet());//returns all entries as Set
		for(Object i:m.keySet()) {
			System.out.println(i+"  "+m.get(i));
		}
		
		//Map has a child interface - Entry
		//Entry Methods
		for(Map.Entry entry:m.entrySet()) {
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}
		
		//iterator()
		Set s = m.entrySet();
		Iterator it = s.iterator();
		while(it.hasNext()) {
			Map.Entry entry = (Entry) it.next();
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}
		
		
	}
}


/*
 
 Map and HashMap
 
 Map - is an interface
 Map is implemented by HashMap and HashTable classes
 
 When we need Map:
 when we want to represent key, value pairs we use Map
 eid | ename
 101  David
 102  Snith
 103  John
 
 we must insert key value pair to add in map
 each key is object , each value is object
 
 Map doesnot allows duplicate keys , but duplicate values are not allowed
 every key and value pair is called as entry
 map is a collection of Entry
 
 HashMap[class] implements Map interface
 underlying datastructure is Hashtable
 Insertion order is not preserved
 hashmap duplicate keys not allowed , values can be duplicate
 Null key is allowed only once
 null values we can have multiple 
 
 HashMap is preferred when we want search operation , it is very fast
 
 methods in HashMap
 m.put(key,value) - add entry
 m.putAll(map c) -  multiple key value pairs are added
 m.get(key) - return value
 m.remove(key) - remove a entry
 m.containsKey(key) - returns true or false
 m.containsValue(value)
 m.isEmpty()
 m.size()
 m.clear()
 
 methods that work on key and value i.e on entry
 m.keyset() - returns all keys in form of a Set object[Set because duplicates r not allowed in keys]
 m.values() - returns all values  in form of Collection
 m.entrySet() - returns all keys and values
 
 each key value pair can be represented as Entry
 Entry is an interface inside HashMap
 methods in Entry
 getKey(key)
 getValue(value)
 setValue(object)
 Entry is a subset of HashMap class
 
 
  
 
 */