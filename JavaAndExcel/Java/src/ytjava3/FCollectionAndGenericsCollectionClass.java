package ytjava3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FCollectionAndGenericsCollectionClass {
	public static void main(String[] args) {
		List<Integer> values = new ArrayList<>();
		values.add(12);

		values.add(132);
		values.add(1);

		Collections.sort(values);

		Collections.reverse(values);
		
		Collections.shuffle(values);

		System.out.println(values);
		
		//List is mutable , we can change values of list
	}

}
