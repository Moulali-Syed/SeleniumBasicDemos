package java3;

import java.util.HashSet;

public class KFindCommonElementsFromTwoArrays3 {

	public static void main(String[] args) {
		//if arrays has duplicate elements
		int[] arr1 = {4,3,7,9,2,4};
		int[] arr2 = {5,1,4,8,3,5};
		
		HashSet<Integer> hs1 = new HashSet<>();
 		HashSet<Integer> hs2 = new HashSet<>();
		for(int num:arr1) {
			hs1.add(num);
		}
		for(int num:arr2) {
			hs2.add(num);
		}
		
		for(int num:hs2) {
			boolean b = hs1.add(num);
			if(b==false) {
				System.out.println(num);
			}
		}
	}
}
