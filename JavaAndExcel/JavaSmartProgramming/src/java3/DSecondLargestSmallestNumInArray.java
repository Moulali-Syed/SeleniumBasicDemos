package java3;

public class DSecondLargestSmallestNumInArray {

	public static void main(String[] args) {
		int[] a = {6,8,2,9,3,1,5,7};
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				//descending order sort , if we need ascending give a[i]>a[j] as condition
				if(a[i]<a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Second largest element is "+a[1]);
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				//descending order sort , if we need ascending give a[i]>a[j] as condition
				if(a[i]>a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Second Smallest element is "+a[1]);
	}
}
