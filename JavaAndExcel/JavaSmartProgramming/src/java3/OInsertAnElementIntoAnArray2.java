package java3;

public class OInsertAnElementIntoAnArray2 {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40, 50 };

		int position = 3;
		int element = 100;
		
		for(int i=a.length-1;i>position-1;i--) {
			a[i]=a[i-1];
		}
		a[position-1] = element;
		for(int n:a) {
			System.out.print(n+" ");
		}
	}
}
