package java3;

import java.util.ArrayList;

public class LFindCommonElementsIn3SortedArrays {

	public static void main(String[] args) {
		
		int[] arr1 = {2,4,8};
		int[] arr2 = {2,3,4,8,10,16};
		int[] arr3 = {2,8,14,40};
		
		int x=0,y=0,z=0;
		ArrayList<Integer> al = new ArrayList();
		while(x<arr1.length && y<arr2.length && z<arr3.length) {
			if(arr1[x]==arr2[y] && arr2[y]==arr3[z]) {
				al.add(arr1[x]);
				x++;
				y++;
				z++;
			}else if(arr1[x]<arr2[y]) {
				x++;
			}
			else if(arr2[y]<arr3[z]) {
				y++;
			}else {
				z++;
			}
		}
		for(int num:al) {
			System.out.print(num+" ");
		}
	}
}
