package collectionsFreamwork;

import java.util.HashSet;

public class CollectionsDemo11 {
	public static void main(String[] args) {
//union, intersection ,difference

		HashSet<Integer> set1 = new HashSet<Integer>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		
		System.out.println(set1);
		
		HashSet<Integer> set2 = new HashSet<Integer>();
		set2.add(3);
		set2.add(4);
		set2.add(5);
		System.out.println(set2);
		
		//union
		set1.addAll(set2);
		System.out.println(set1);
		
		//intersection
		set1.retainAll(set2);
		System.out.println(set1);//common elements of set1 and set2 will be retained
		
		//difference
		set1.removeAll(set2);
		System.out.println(set1);//all common elements removed
		
		//subset
		set1.containsAll(set2);//checks if all elements in set2 are present in set1 - returns true or false
		
		
		
	}
}
