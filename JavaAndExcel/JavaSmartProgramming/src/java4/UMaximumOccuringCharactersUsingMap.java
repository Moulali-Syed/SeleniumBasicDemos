package java4;

import java.util.HashMap;
import java.util.Map;

public class UMaximumOccuringCharactersUsingMap {

	public static void main(String[] args) {
		
//		String s1 = "this is demo";
//		s1 = s1.replaceAll("\\s","");
		String s = "abbccc";
		HashMap<Character,Integer> hm = new HashMap<>();
		
		char[] c = s.toCharArray();
		for(char ch:c) {
			if(hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch)+1);
			}else {
				hm.put(ch, 1);
			}
		}
		
		int maxCount = 0;
		char maxChar = ' ';
		for(Map.Entry<Character,Integer> me:hm.entrySet()) {
			if(maxCount < me.getValue()) {
				maxCount = me.getValue();
				maxChar = me.getKey();
			}
		}
		
		System.out.println("maximum repeated character "+maxChar);
	}
}
