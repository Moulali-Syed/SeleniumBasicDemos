package java2;

public class ZStringSortWithSelectionSort {
	
	public static void main(String[] args) {
		String[] a = {"deepak","amit","rahul" ,"vironika","rohit","deepesh"};
		int min;
		String temp;
		for(int i=0;i<a.length;i++) {
			min = i;
			for(int j=i+1;j<a.length;j++) {
				
				if(a[j].compareTo(a[min])<0) {
					min = j;
				}
			}
			temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		
		for(String i:a) {
			System.out.print(i+" ");
		}
	}

}
