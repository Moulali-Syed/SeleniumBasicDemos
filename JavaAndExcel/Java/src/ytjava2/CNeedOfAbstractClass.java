package ytjava2;

class Printer {

	/*
	public void show(Integer i) {
		System.out.println(i);
	}
	
	public void show(Double i) {
		System.out.println(i);
	}
	*/
	// Integer and Number extends Number class , so instead of defining 2 methods with parameter Integer ,Double
	//we can simply define which takes both values | Float also extends Number
	
	public void show(Number i) {
		System.out.println(i);
	}
}

public class CNeedOfAbstractClass {

	public static void main(String[] args) {
		Printer obj = new Printer();
		obj.show(5.5);
	}
}

//we dont want others create object of class and instead of creating multiple methods we can use 
//same method in sub class objects - Neeed of abstract