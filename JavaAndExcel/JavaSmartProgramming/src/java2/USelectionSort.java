package java2;

public class USelectionSort {
	
	public static void main(String[] args) {
		String[] a = {"deepak","rahul","ramesh","apple","amit","bhuppli"};
		int min;
		String temp="";
		for(int i=0;i<a.length;i++) {
			min=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j].compareTo(a[min])<0) {
					min=j;
					
				}
			}
			temp=a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		
		for(String i:a) {
			System.out.print(i+" ");
		}
	}

}
/*

The selection sort is a combination of searching and sorting
it sorts an array by repeatedly finding the minimum element (considering ascending order)
from unsorted part and putting it at begining in every iteration of selectionsort the minimum
element (considering ascending order) from unsorted subarray is picked and moved to sorted subarray


38 52 9 18 6 62 13

		38 52 9 18 6 62 13
check the smallest element than 1st element in whole list and replace their position
		6 52 9 18 38 62 13
now check 2nd element and smallest than it in all next elements in list
		6 9 52 18 38 62 13
check 3rd and the next
		6 9 13 18 38 62 52
check 4th and the next
		6 9 13 18 38 62 52
check 5th and next
		6 9 13 18 38 62 52
check 6th and next
		6 9 13 18 38 52 62

at last we get
		6 9 13 18 38 52 62
		
		The algorithm maintains two sub arrays in a given array
		The subarray which is already sorted
		remaining subarray which is unsorted
		

		
*/