package ytjava;

class A {

	public A() {
		System.out.println("A class construtor");
	}

	public A(int i) {
		System.out.println("in A int");
	}
}

class B extends A {
	public B() {
		System.out.println("B class constructor");
	}

	public B(int i) {
		System.out.println("in B int");
	}
}

public class USuperMethod {
	public static void main(String[] args) {
		B obj = new B(); // constructor of super class and sub class both
		/*
		 * A class construtor
		   B class constructor
		 */
		B obj1 = new B(10);
		/*
		 * A class construtor
		   in B int
		 */
		
		/*
		 because the constructor in sub class is not calling the parent class construtor so default constructor is called
		 public B(int i) {
		System.out.println("in B int");
	}
		 */

	}

}
