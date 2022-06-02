package collectionsFreamwork;

import java.util.LinkedHashSet;

public class CollectionsDemo13 {

	
	public static void main(String[] args) {
		LinkedHashSet lset =  new LinkedHashSet();
//		LinkedHashSet<Integer> lset =  new LinkedHashSet<Integer>();
		
		lset.add(100);
		lset.add(200);
		lset.add(300);
		lset.add(400);
		
		//all other methods in HashSet are same in LinkedHashSet
	}
}

/*
 
 Collections --Set -- LinkedHashSet
 
 HashSet 								LinkedHashSet
 duplicates not allowed					duplicates not allowed
 insertion order not preserved			insertion order not preserved
 underlying DS is HashTable				HashTable+LinkedList
 
 initial size 16 , 0.75                   initial size 16 , 0.75
 
 same methods available in both
 
 */
