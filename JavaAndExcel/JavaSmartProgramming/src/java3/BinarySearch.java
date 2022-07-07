package java3;

public class BinarySearch {
	
	public static void main(String[] args) {
		int[] a = {2,5,7,9,12,14,16,17,19,20,24,28};
		
		int search = 16;
		int li = 0;
		int hi = a.length -1;
		int mi = (li+hi)/2;
		while(li<=hi) {
			if(a[mi]==search) {
				System.out.println("element is at "+mi+" index position");
				break;
			}else if(a[mi]<search) {
				li = mi+1;
			}else {
				hi = mi-1;
			}
			mi = (li+hi)/2;
		}	
		if(li>hi) {
			System.out.println("element not found");
		}
	}

}
/*

Binary search is process of searching an element from sorted array by repeatedly
dividing the search interval in half

Binary Search is faster than linear search

Although binary search is a very optimised way of searching a particular element
but array must be sorted on which u want to perform search process

if array is not sorted in advance then we have to perform sorting first and then 
only we can perform binary search on that

		1 2 4 5 7 8 9
		li    mi     hi
li =lower index ,hi = higher index , mi = middle index
while(li<=hi){
	if(a[mi] == item){
	
	sop(item is at + i + index position);
	}else if(a[mi]<item){
		li = mi+1;
	}else{
		hi = mi-1;
	}
	
	mi = (li+hi)/2

}
*/