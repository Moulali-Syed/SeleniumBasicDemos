package java2;

public class TBubbleSort2 {

	public static void main(String[] args) {
		String[] a = {"amit","deepak","manik","apple","mango"};
		String temp ;
		for(int i=0;i<a.length;i++) {//number of rounds
			int flag = 0;
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j].compareTo(a[j+1])>0) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					flag=1;
				}
			}
			if(flag == 0) {
				break;
			}
		}

		for(String i:a) {
			System.out.print(i+" ");
		}
	}

	//if we want to sort string we use compareTo() method
	//compareTo() method is used for comparing two strings lexicographically
	//each character of both strings is converted to unicode value for comparison
	//if both strings are equal then this method returns 0 else it returns positive
	//or negative values the result is positive if first string is lexicographically
	//greater than the second string else the result would be negative

	//if both charcters eqaul - returns 0 , if small -1 and greater 1
}

/*
Sorting is process of arranging the data in some logical order
in case of numeric values logical order may be in ascending order or descending order
in case of alphanumeric values it can be dictionary order

BubbleSort also referred to as sinking sort , is a comparision based algorithm
comparing each pair of adjacent items and swapping them if they are in wrong order
the pass through list is repeated until no swaps are needed which indicates that list
is sorted

36 19 29 12 5

Round -1
		36 19 29 12 5
		19 36 29 12 5
		19 29 36 12 5
		19 29 12 36 5
		19 29 12 5  36
Round -2
		19 29 12 5  36
		19 29 12 5  36
		19 12 29 5  36
		19 12 5  29  36

Round -3
		19 12 5   29  36
		12 19 5   29  36
		12 5  19  29  36

Round -4
		12 5   19  29  36
		5  12  19  29  36

Number of rounds = total Numbers -1
here  4 = 5 - 1

*/