package javalangfeatures;

import java.util.ArrayList;
import java.util.List;

//public class GenericsDemo {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		List<String> EmplyeeNames = new ArrayList<String>();
//
//		EmplyeeNames.add("Apple");
//		EmplyeeNames.add("Mango");
//		//EmplyeeNames.add(1);// this throws compile time error The method add(int, String) in the type
//							// List<String> is not applicable for the arguments (int)
//	}
//
//}
class Record<E> {
	private E record;

	public void display(E item) {
		System.out.println(item);
	}
}

class Student {
	private int studentId;
	private String studentName;

	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	public String toString() {
		return "Student: Id = " + studentId + " Name = " + studentName;
	}
}

class GenericsDemo {
	public static void main(String[] args) {
		Student s1 = new Student(101, "Robert");
		Record<Integer> integerRecord = new Record<Integer>(); // integerRecord can be used to display only integers
		integerRecord.display(12);
		// integerRecord.display(s1); will give an error as we are trying to add a
		// student class object
		Record<Student> studentRecord = new Record<>(); // studentRecord can be used to display only Students
		studentRecord.display(s1);
		// studentRecord.display(15); will give an error as we are trying to add an
		// integer
	}
}