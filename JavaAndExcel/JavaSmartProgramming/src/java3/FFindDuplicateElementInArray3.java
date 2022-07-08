package java3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FFindDuplicateElementInArray3 {

	public static void main(String[] args) {
		//method2 HashTable - most preferable
		
		int[] a = {3,5,4,3,2,2,3,2,1};
		
		Map<Integer,Integer> hm = new HashMap<>();
		
		for(int num:a) {
			Integer count = hm.get(num);
			if(count == null) {
				hm.put(num,1);
			}else {
				count = count+1;
				hm.put(num, count);
			}
		}
		
		System.out.print("Duplicate elements are ");
		Set<Map.Entry<Integer,Integer>> es = hm.entrySet();
		for(Map.Entry<Integer, Integer> me: es) {
			if(me.getValue()>1) {
				System.out.print(me.getKey()+" ");
			}
		}
	}
}
