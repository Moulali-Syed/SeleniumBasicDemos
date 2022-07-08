package java3;

import java.util.HashSet;

public class KFindCommonElementsFromTwoArrays2 {

	public static void main(String[] args) {
		//if arrays has unique elements
		int[] arr1 = {4,3,7,9,2};
		int[] arr2 = {5,1,4,8,3};
		
		HashSet<Integer> hs = new HashSet<>();
		for(int num:arr1) {
			hs.add(num);
		}
		for(int num:arr2) {
			boolean b = hs.add(num);
			if(b==false) {
				System.out.println(num);
			}
		}
	}
}
