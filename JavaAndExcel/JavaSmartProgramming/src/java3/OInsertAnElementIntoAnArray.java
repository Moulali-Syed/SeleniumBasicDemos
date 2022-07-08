package java3;

public class OInsertAnElementIntoAnArray {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40, 50 };

		int index_position = 3;
		int element = 100;
		
		for(int i=a.length-1;i>index_position;i--) {
			a[i]=a[i-1];
		}
		a[index_position] = element;
		for(int n:a) {
			System.out.print(n+" ");
		}
	}
}
