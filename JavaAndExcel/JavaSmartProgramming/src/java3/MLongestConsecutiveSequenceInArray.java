package java3;

import java.util.HashSet;

public class MLongestConsecutiveSequenceInArray {

	public static void main(String[] args) {
		int[] a = {3,9,1,10,4,20,2};

		//add all elements to hashset
		HashSet<Integer> hs = new HashSet<>();
		for (int element : a) {
			hs.add(element);
		}
		//traverse the array and check in hashset
		int longest_length=0;
		for (int element : a) {
			if(!hs.contains(element-1)) {
				int num = element;
				while(hs.contains(num)) {
					num++;
				}
				if(longest_length<num-element) {
					longest_length = num-element;
				}
			}
		}
		System.out.println(longest_length);
	}
}
