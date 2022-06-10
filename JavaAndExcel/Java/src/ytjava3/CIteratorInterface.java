package ytjava3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CIteratorInterface {

	public static void main(String[] args) {
		Collection values = new ArrayList();

		values.add(9);
		values.add(10);
		values.add(101);

		System.out.println(values);

		Iterator it = values.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
	
	//collection doesnot support index number , so we use Iterator

}
