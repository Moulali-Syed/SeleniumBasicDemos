package java2;

public class YHeapSort {

	public static void main(String[] args) {
		int[] arr = {22,13,17,11,10,14,12};
		YHeapSort hs = new YHeapSort();
		hs.sort(arr);
		hs.printArray(arr);
	}
	void sort(int[] arr) {
		int leng  = arr.length;

		for(int i=leng/2-1;i>=0;i--) {
			heapify(arr,leng,i);
		}
		//swap elements and heapify again
		for(int i=leng-1;i>=0;i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i]  = temp;
			heapify(arr,i,0);
		}
	}

	void heapify(int[] arr,int n,int i) {
		int largest = i;//parent node index position
		int li = 2*i+1;//left child node index position
		int ri = 2*i+2;//right child node index position

		if(li<n && arr[li] > arr[largest]) {
			largest = li;
		}
		if(ri<n && arr[ri] > arr[largest]) {
			largest = ri;
		}
		if(largest != i) {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;

			heapify(arr,n,largest);
		}
	}
	void printArray(int[] arr) {
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
}
/*
Tree:

We have 2 types of data structure:
linear and non linear data structures
Array, Stack , Queue, linked list are linear data structures
Tree, graph are  non linear data structures

Tree is non linear data structrue and consist of parent child relationship
Tree is sequence of nodes
there is a starting node known as root node
every node other than root node has a parent node
nodes may have any number of children

			   *[root]
	  		/  | \
parentnode] *  *  *
		   /\      \
   		  *  *      *[leaf node]
	 child node

Any tree has maximum 2 child is binary tree and it doesnot accept duplicates
			binary tree
			 *
			/ \
	   	    *  *
	   	   /\  /\
	   	   * * * *
	   any element greater than root node will comes in right hand side and any element
	   smaller than root element will comes in left hand side

	    40
	  35   56
	 22  48  65
	  28

 Heap is also a binary tree but has some extra properties
 property1:
 5 3 4 7 9 6 1
 		5			----------------
 	3       4							complete binary tree
  7   9    6  1	    ----------------


 5 3 4 7 9 6 1 8
 		5			----------------
 	3       4							Almost complete binary tree
  7   9    6  1	    ----------------
 8

 property2:
  child node will either >= parent node or <= parent node

  heaps are of 2 types
  min heap
       10
   11      14
  12 13   17 12

  max heap
  		22
  	13      17
  11 10    14 12

  representation of heap in array:
  22 13 17 11 10 14  12

  			22
  		13      17
  	 11   10  14  12

 level wise we can input the elements in a tree to a array
  	22 13 17 11 10 14 12
  	0   1  2  3  4  5  6

  	child index left  : 2*i+1
  	child index right : 2*i+2

  	parent index: (i-1)/2

  	====================================================
  	Heap sort
  	22 13 17 11 10 14  12

  			22
  		 13    17
  	   11  10 14 12

  	 12 13 17 11 10 14  22
  	 		12--------> 13------->17
  	 	   13	       12 17     12     14
  								11 10  13
  	17 12 14 11 10 13

  		 13 12 14 11 10 17 22

*/