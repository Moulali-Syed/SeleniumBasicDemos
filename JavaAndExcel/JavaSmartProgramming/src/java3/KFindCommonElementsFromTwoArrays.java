package java3;

import java.util.HashSet;

public class KFindCommonElementsFromTwoArrays {

	public static void main(String[] args) {
		int[] arr1 = {4,3,7,9,2,8,8};
		int[] arr2 = {5,1,4,8,8,13};
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					hs.add(arr1[i]);
					break;
				}
			}
		}
		
		for(int ele:hs) {
			System.out.print(ele+" ");
		}
	}
}
