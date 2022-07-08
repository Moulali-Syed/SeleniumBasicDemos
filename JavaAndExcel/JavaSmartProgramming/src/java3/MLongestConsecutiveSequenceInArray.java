package java3;

import java.util.HashSet;

public class MLongestConsecutiveSequenceInArray {

	public static void main(String[] args) {
		int[] a = {3,9,1,10,4,20,2};
		
		//add all elements to hashset
		HashSet<Integer> hs = new HashSet<>();
		for(int i=0;i<a.length;i++) {
			hs.add(a[i]);
		}
		//traverse the array and check in hashset
		int longest_length=0;
		for(int i=0;i<a.length;i++) {
			if(!hs.contains(a[i]-1)) {
				int num = a[i];
				while(hs.contains(num)) {
					num++;
				}
				if(longest_length<num-a[i]) {
					longest_length = num-a[i];
				}
			}
		}
		System.out.println(longest_length);
	}
}
