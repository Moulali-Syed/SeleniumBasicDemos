package java2;

public class XQuickSort {

	public static void main(String[] args) {
		int[] arr = {15,9,7,13,12,16,4,18,11};
		int leng = arr.length;
		XQuickSort obj = new XQuickSort();
		obj.quickSortRecursion(arr, 0, leng-1);
		obj.printArray(arr);
	}

	int partition(int[] arr,int low,int high) {
		int pivot = arr[(low+high)/2];
		while(low<=high) {
			while(arr[low]<pivot) {
				low++;
			}
			while(arr[high]>pivot) {
				high--;
			}
			if(low<=high) {
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;

				low++;
				high--;
			}
		}
		return low;
	}

	void quickSortRecursion(int[] arr,int low,int high) {
		int pi = partition(arr,low,high);
		if(low<pi-1) {
			quickSortRecursion(arr,low,pi-1);
		}
		if(pi<high) {
			quickSortRecursion(arr,pi,high);
		}
	}

	void printArray(int[] a ) {
		for(int i:a) {
			System.out.print(i+" ");
		}
	}
}
/*
Quick Sort:
is sometimes called Partition-exchange sort it is an efficient sorting algorithm
serving as a systematic method for placing elements of an array in order
it was developed by Tony Hoare 1959 and published in 1961

The three steps of quick sort algorithm are as follows
Divide : re arrange the elements and split the array into two sub arrays
and an element (known as pivot) in between such that each element in left sub array
is less than or equal to pivot element and each element in right sub array is greater than
pivot element

Conquer: Recursively sort the two sub arrays
Combine : the solution of sub problems to create a solution to original problem

	15 9 7 13 12 16 4 18 11
	0  1 2  3  4  5 6  7  8

	3 options to choose pivot element are:
	1.left or right end . this could give O(n^2) performance depending on input so bad choice
		but easy to implement
	2.best of 3 .left middle right , this gives better performance
	3.random , random pivot is fairly easy to implement ans guarantees nlogn performance.
		so it is good choice


	15 9 7 13 12 16 4 18 11
	0  1 2  3  4  5 6  7  8
	i=0			|		   j=8
			 pivot =12


	11 9 7 13 12 16 4 18 15
	0  1 2  3  4  5 6  7  8
	  i=1	   |	  j=7
			 pivot =12

	11 9 7  4 12  16 13 18 15
	0  1 2  3  4  5  6   7  8
	  	   		| j=5
			 i,pivot =12

  then we apply recursion for first and second half from pivot
  while(i<=j)
  {
	while(arr[i] < pivot)
	{
		i++;
	}
	while(arr[j] > pivot){
		j--;
	}
	if(i<=j){
		swap
		i++;
		j--;
	}
   }
*/