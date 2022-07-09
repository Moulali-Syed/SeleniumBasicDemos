package java3;

import java.util.HashSet;

public class KFindCommonElementsFromTwoArrays {

	public static void main(String[] args) {
		int[] arr1 = {4,3,7,9,2,8,8};
		int[] arr2 = {5,1,4,8,8,13};
		HashSet<Integer> hs = new HashSet<>();
		for (int element : arr1) {
			for (int element2 : arr2) {
				if(element==element2) {
					hs.add(element);
					break;
				}
			}
		}

		for(int ele:hs) {
			System.out.print(ele+" ");
		}
	}
}
