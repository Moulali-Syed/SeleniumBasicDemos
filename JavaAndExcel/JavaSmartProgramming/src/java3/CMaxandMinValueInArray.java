package java3;

public class CMaxandMinValueInArray {

	public static void main(String[] args) {
		int[]  a = {4,3,5,13,2,1,6};
		int min=a[0];
		int max = a[a.length-1];
	
		for(int i=1;i<a.length;i++) {
			if(a[i]<min) {
				min = a[i];
			}
			if(a[i]>max) {
				max = a[i];
			}
		}
		System.out.println(min);
		System.out.println(max);
		
	}
}
