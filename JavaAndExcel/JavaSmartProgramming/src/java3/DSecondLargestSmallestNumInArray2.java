package java3;

public class DSecondLargestSmallestNumInArray2 {

	public static void main(String[] args) {
		int[] a = {6,8,2,4,3,1,5,7,9};
		
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]>largest) {
				secondLargest = largest;
				largest = a[i];
			}else if(a[i]>secondLargest && a[i]!= largest) {
				secondLargest = a[i];
			}
		}
		if(secondLargest == Integer.MIN_VALUE) {
			System.out.println("there is no second largest element in list");
		}
		else {
			System.out.println("Second largest element is "+secondLargest);
		}
		
		
		int largest1 = Integer.MAX_VALUE;
		int secondLargest1 = Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]<largest1) {
				secondLargest1 = largest1;
				largest1 = a[i];
			}else if(a[i]<secondLargest1 && a[i]!= largest1) {
				secondLargest1 = a[i];
			}
		}
		if(secondLargest1 == Integer.MAX_VALUE) {
			System.out.println("there is no second largest element in list");
		}
		else {
			System.out.println("Second Smallest element is "+secondLargest1);
		}
				
	}
}
