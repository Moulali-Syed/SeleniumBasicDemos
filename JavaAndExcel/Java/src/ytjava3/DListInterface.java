package ytjava3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DListInterface {

	public static void main(String[] args) {
		List values = new ArrayList();

		values.add(9);
		values.add(10);
		values.add(101);

		values.add(2, 121);

		System.out.println(values);

		Iterator it = values.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// List supports index numbers

		for (int i = 0; i < values.size(); i++) {
			System.out.println(values.get(i));
			System.out.println(values.get(i) instanceof Integer);
		}

	}
}
