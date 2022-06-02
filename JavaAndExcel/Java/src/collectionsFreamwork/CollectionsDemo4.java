package collectionsFreamwork;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class CollectionsDemo4 {

	public static void main(String[] args) {
		
		//different ways to Declare arrayList
		ArrayList al = new ArrayList();
//		ArrayList<String> al1 = new ArrayList<String>();
//		ArrayList<Integer> al2 = new ArrayList<Integer>();
//		
//		List al3 = new ArrayList();
		
		//add new elements
		al.add(100);
		al.add("Welcome");
		al.add(15.5);
		al.add('A');
		al.add(true);
		System.out.println(al);
		
		System.out.println("no of elements in arraylist"+al.size());
		
		//remove element
		al.remove(1);// 1 is index
		al.remove(15.5); // we can also pass element
		System.out.println("After removing elements"+al);
		
		//add based on index
		al.add(2,"python");
		System.out.println("After insertion"+al);
		
		//retreive specific element
		System.out.println(al.get(0));//0 is index
		
		//replace element 
		al.set(2, "C#");
		System.out.println("after replacing"+al);
		
		//search - contains()
		al.contains("C#"); //returns true or false
		
		//isEmpty
		System.out.println(al.isEmpty());
		
		//read data - for , foreach, iterator
		System.out.println("Reading elements using for loop");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println("Reading elements using for each loop");
		for(Object e:al) {
			System.out.println(e);
		}
		
		System.out.println("Reading elements using iterator");
		Iterator it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}
}
/*
 * Collections is an interface - which is implemented by List
 * 
 * inturn it is implemented by ArrayList
 * 
 * ArrayList - we can duplicate elements and preserve insertion order
 * 
 * Array list is present in java.util package
 * 
 * syntax: ArrayList al = new ArrayList();
 * 
 * arraylist is growable , default size is 10
 * 
 * 
 * ArrayList - has many methods we can define arraylist in many ways ArrayList
 * al = new ArrayList(); - can store heterogenous data
 * 
 * ArrayList<String> al = new ArrayList<String>(); -- homogeneous data
 * 
 * 1.add(object) -----> adds at last 2.add(index,object) -----> adds at
 * particular index position 3.size() ---> gives number of elements in arraylist
 * 4.remove(index) 5.get(index) 6.set(index,object) 7.contains(object)
 * ----->returns boolean value whether present or not 8.isEmpty() 9.addAll() -->
 * add group of objects 10.removeAll() --> removes a group of elements 11.to
 * sort all elements must be of homogeneous data collections.sort(arrayList)
 * collections.shuffle(arrayList)
 * 
 * 12.array to arrayList
 * 
 */