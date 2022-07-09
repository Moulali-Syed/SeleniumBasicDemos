package java2;

public class VInsertionSort {

	public static void main(String[] args) {
		int[] a = {5,1,6,2,4,3};
		int temp ,j;
		for(int i=1;i<a.length;i++) {
			temp = a[i];
			j=i;
			while(j>0 && a[j-1]>temp) {
				a[j]=a[j-1];
				j=j-1;
			}
			a[j]=temp;
		}
		for(int i:a) {
			System.out.print(i+" ");
		}
	}

}

/*

Insertion sort is a simple algorithm that works the way we sort playing cards
in our hands

We choose one card and insert it in its position(ascending or descending)
beneficial only for small element array

5 1 6 2 4 3

		5 1 6 2 4 3
		1 5 6 2 4 3//check 2nd element with 1st element , if small swap
		1 5 6 2 4 3//check 3rd
		1 2 5 6 4 3//check 4th
		1 2 4 5 6 3//check 5th element n insert it at correct position
		1 2 3 4 5 6//check 6th element


5 1 6 2 4 3
1st store 1 in temp , then check before elements and insert it in right position
then make 6 as temp , then store check elements before it
then make 2 as temp , then check all elements before it
then make 4 as temp , then check all elements before it
then make 3 as temp , then check all elements before it and insert it at right position


Working of insertion sort:
1.we start by making the second element of given array i.e element at index 1, the key
The key element here is the new card that we need to add to our existing sorted set of cards
(as explained cards example)
2.we compare the key elements with elements before it in case element at index 0:
	2.1 if the key element is less than first element we insert the key element before first element
	2.2 if key element is greater than first element then we insert it after first element

3.then we make the third element of array as key and will compare it with elements to its
	left and insert it at right position
3.And we go on repeating this, until array is sorted

*/