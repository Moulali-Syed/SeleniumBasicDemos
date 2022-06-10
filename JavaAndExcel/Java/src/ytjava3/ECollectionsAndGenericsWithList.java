package ytjava3;

import java.util.ArrayList;
import java.util.List;

public class ECollectionsAndGenericsWithList {

	public static void main(String[] args) {

		// adding List<Integer> makes collection typesafe
		List<Integer> values = new ArrayList<>();

		values.add(12);
		values.add(13);
		values.add(24);

		for (Integer o : values) {
			System.out.println(o);
		}

	}

}
