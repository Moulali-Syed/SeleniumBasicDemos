package ytjava2;

final class A {
	final int i = 12; // final variable , it will become constant
	final int Day;

	public A() {
		Day = 1;
	}
	
	public final void show() {
		
	}
}


//final class cannot be inherited , no other class can extend it

//final method - cannot be overridden

public class EFinalKeyword {

	// final keyword can be used with method , variable , class

	public static void main(String[] args) {
		A obj = new A();
		System.out.println(obj.i);

	}
}
