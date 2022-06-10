package ytjava2;

//static method in interface

interface Demo4 {
	
	//by default variables in interface will be constant , i.e it is final
	int i =8;
	void abc();

	// say i have method in interface , to call it i have to implement this
	// interface and create object of class
	// to access that method
	// from java 8 , if we have a method and we want to call it using interface we
	// can mark method as static

	static void show() {
		System.out.println("Hi");
	}
}

class DemoImp implements Demo4{
	public void abc() {
		System.out.println(Demo4.i);
	}
}

public class LStaticMethodInInterface {
	public static void main(String[] args) {

		Demo4.show();
		
		//variables of interface are by default static final
		System.out.println(Demo4.i);
	}
}

/*
 * we can have abstract methods , we can have default methods , static methods
 * 
 * variables in interface are by default final
 */
