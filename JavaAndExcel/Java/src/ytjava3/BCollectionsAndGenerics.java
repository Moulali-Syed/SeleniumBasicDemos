package ytjava3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BCollectionsAndGenerics {
	
	public static void main(String[] args) {
		Collection values = new ArrayList();
		
		values.add(5);
		values.add(6);
		
		Collection<Integer> vals = new ArrayList<Integer>();
		
		List<Integer> nums = new ArrayList<>();
	}

}

/*
Collections:

Collection is an inteeface
Collections class

Collection of integers we can define using array
int a[] = new int[4];
but array size is fixed

so instead of array we can use Collection

Collection values = new ArrayList();
values.add(5);
		values.add(6);
		
size is growable

if number of elements is fixed go to array because array is fast , else go to Collection

Collection can accept any datatype,
to specify which datatype we r using , we must use generics

Collection --- List ----ArrayList

List allows duplicate values , order of elements is maintained , every element has a unique index

Set<Integer> numbers = new HashSet<>();
//doesnot allow duplicates and order which we get elements is random
 
Set<Integer> numbers = new TreeSet<>();
TreeSet gives everything in a sorted format

Map:
in map we have key , value pairs
Map<Integer,String> m = new HashMap<>();

//hashmap , hashTable depends usage on thread safe or not

*/