package ytjava;

class A {

	public A() {
		System.out.println("A class construtor");
	}

	public A(int i) {
		System.out.println("in A int");
	}
	
	public A(int i,int j) {
		System.out.println("i and j in A");
	}
}

class B extends A {
	public B() {
		System.out.println("B class constructor");
	}

	public B(int i) {
		System.out.println("in B int");
	}
	
	public B(int i,int j) {
		super(i,j);
		System.out.println("i and j in B");
	}
}

public class USuperMethod {
	public static void main(String[] args) {
		B obj = new B(); // constructor of super class and sub class both
		/*
		 * A class construtor
		   B class constructor
		 */
		B obj1 = new B(10); //without super ,it will call default parent class constructor and 
		//parameterized child constructor
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
		
		B obj2 = new B(1,2);
/*
 i and j in A
i and j in B

we are using to call parent constructor
public B(int i,int j) {
		super(i,j);
		System.out.println("i and j in B");
	}
	
	
 */
	}

}
