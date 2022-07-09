package java3;

public class FFindDuplicateElementInArray {

	public static void main(String[] args) {
		//method1 brute force : not preferable if duplicate elements is more than 2
		//also gives performance issue when there are more number of elements

		int[] a = {3,5,4,3,2,2,1};

		System.out.print("Duplicate elements are ");
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {

				if((a[i]==a[j]) && (i!=j)) {
					System.out.print(a[j]+" ");
				}
			}
		}
	}
}
