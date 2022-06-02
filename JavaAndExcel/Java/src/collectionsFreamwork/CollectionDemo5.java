package collectionsFreamwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionDemo5 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		al.add("App");
		al.add(1);
		al.add('g');
		al.add("jdsf");
		
		ArrayList al_dup = new ArrayList();
		al_dup.addAll(al);
		System.out.println(al_dup);
		
		al_dup.removeAll(al);
		System.out.println("After removing "+al_dup);
		
		//Sort  --- we can use methods from collections
		ArrayList al1=new ArrayList();
		al.add(12);
		al.add(15);
		al.add(98);
		System.out.println("elements in arrayList"+ al1);
		Collections.sort(al1);
		
		Collections.sort(al1,Collections.reverseOrder());
		
		
		//shuffle
		Collections.shuffle(al1);
		System.out.println(al1);
		
		
		String arr[] = {"Dog","Cat","Elephant"};
		for(String val:arr) {
			System.out.println(val);
		}
		ArrayList arl = new ArrayList(Arrays.asList(arr));
		System.out.println(arl);
		
	}
}
