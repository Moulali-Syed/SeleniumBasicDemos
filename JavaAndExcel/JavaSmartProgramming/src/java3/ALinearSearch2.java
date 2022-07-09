package java3;

public class ALinearSearch2 {
	public static void main(String[] args) {

		int[] a = {5,3,4,6,1,2};
		int item = 1;
		int temp = 0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==item) {
				System.out.println("element is found at index position "+i);
				temp = temp+1;
			}
		}
		if(temp==0) {
			System.out.println("item not found in list");
		}

	}
}

/*

 Searching is widely used

 Linear Search is a very simple search algorithm in this type of search a sequential
 search is made over all items one by one .Every item is checked and if a match is found
 then that particular item is returned otherwise the search continues till end of data collection

 suppose we have a array
 		 5 3 6 1 4 2
 	a simple approach for linear search is as follows
 	arr is array and x is variable which we have to search in an array
 	1.start from leftmost element of arr[] and one by one compare x with each element of arr[]
 	2.if x matches with element print index position
 	2.if x doesnot match with an element print not found

 	linear search is inefficient , if array being searched has 20000 elements if we search
 	linearly we have to make maximum of 20000 comparisions
 	linear search is rarely practical because other search algorithms and schemas such as
 	binary search algorithm and hash tables allow significantly faster searching for all
 	but short lists
 */
