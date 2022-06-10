package ytjava2;

//abstarct class - we can define a method and we can declare a method
//interface - we can only declare methods till 1.7 , from java 1.8 we can define methods

@FunctionalInterface
interface Demo {
	void abc();

	// default methods in interface allowed from java 8
	public default void show() {
		System.out.println("hello");
	}

	// static methods in interface allowed from java9
	public static void sayHi() {
		System.out.println("Hi");
	}
}

class DemoImpl implements Demo {
	public void abc() {
		System.out.println("happy");
	}

	// we can override methods as well
	public void show() {
		System.out.println("in DemoImpl Hello");
	}

	public static void sayHi() {
		System.out.println(" hi from demoImpl");
	}
}

public class JDefaultMethodInInterface {

	public static void main(String[] args) {
		Demo obj = new DemoImpl();
		obj.abc();
		obj.show();
		Demo.sayHi();
		DemoImpl.sayHi(); //this is static and not related to object , we can override and call with classname.methodname
	}
}

/*
 * 
 * 
 * @FunctionalInterface interface Demo{ void abc();
 * 
 * //default methods in interface allowed from java 8 public default void show()
 * { System.out.println("hello"); }
 * 
 * //static methods in interface allowed from java9 public static void sayHi() {
 * System.out.println("Hi"); } }
 * 
 * we can declare Functional Interface because we are having only one abstarct
 * method
 * 
 */