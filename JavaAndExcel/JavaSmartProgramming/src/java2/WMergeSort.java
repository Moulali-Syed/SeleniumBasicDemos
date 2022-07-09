package java2;

public class WMergeSort {

	int[] array;
	int[] tempMergeArr;
	int length;
	public static void main(String[] args) {
		int[] a = {48,36,13,52,19,94,21};
		WMergeSort obj = new WMergeSort();
		obj.sort(a);

		for(int i:a) {
			System.out.print(i+" ");
		}
	}

	public void sort(int[] a) {
		this.array = a;
		this.length = a.length;
		this.tempMergeArr = new int[length];
		divideArray(0,length-1);

	}

	public void divideArray(int lowerIndex,int higherIndex) {
		if(lowerIndex<higherIndex) {
			int middle = lowerIndex + (higherIndex-lowerIndex)/2;
			//it will sort left side array
			divideArray(lowerIndex,middle);
			//it will sort right side array
			divideArray(middle+1,higherIndex);
			mergeArray(lowerIndex,middle,higherIndex);
		}
	}

	public void mergeArray(int lowerIndex,int middle,int higherIndex) {
		for(int i=lowerIndex;i<=higherIndex;i++) {
			tempMergeArr[i] = array[i];
		}

		int i=lowerIndex;
		int j=middle+1;
		int k=lowerIndex;
		while(i<=middle && j<=higherIndex) {
			if(tempMergeArr[i]<=tempMergeArr[j]) {
				array[k] = tempMergeArr[i];
				i++;
			}else {
				array[k] = tempMergeArr[j];
				j++;
			}
			k++;
		}
		while(i<=middle) {
			array[k] = tempMergeArr[i];
			k++;
			i++;
		}
	}
}


/*
Merge sort is one of the most popular sorting algorithms and widely used technique

Its time complexity is (i.e T(n) = 2T(n/2)+n ) is better as compared to bubble sort,
selection sort and insertion sort

Algorithm: Divide and Conquer
Here's how merge sort uses divide and conquer
1.divide the unsorted list into n sublists , each containing 1 element
2.Take adjacent pairs of two singleton lists and merge them to form a list
  of 2 elements . n will now convert into n/2 lists of size 2
3.Repeat the process till a single sorted list of obtained


			48 36 13 52 19 94 21
			/			  \
	48 36 13 			  52 19 94 21
	   /\					  /\
	 48  36 13   		52 19   94 21
	  |    /\			  /\     /\
	  48  36 13 		52  19  94 21
	  |    \/			  \ /    \ /
	  48  13 36          19 52  21 94
	    \/					\     /
	  13 36 48			  19 21 52 94
	  		\			   /
	  		13 19 21 36 48 52 94

divide elements till they become individual , then merge them based on sort
*/