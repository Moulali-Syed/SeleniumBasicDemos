package java3;

import java.util.HashSet;
import java.util.Set;

public class FFindDuplicateElementInArray2 {

	public static void main(String[] args) {
		//method2 Set Interface
		//if an element is repeating more than 2 times , it will again print , same problem
		//as brute force , but better performance
		int[] a = {3,5,4,3,2,2,1};

		Set<Integer> s = new HashSet<>();

		System.out.print("Duplicate elements is ");
		for(int num:a) {
			boolean b = s.add(num);
			if(!b) {
				System.out.print(num+" ");
			}
		}
	}
}
