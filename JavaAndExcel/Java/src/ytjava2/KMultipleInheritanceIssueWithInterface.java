package ytjava2;

//we can define methods in interface from java 1.8
//in java we dont have multiple inheritance using classes because of ambiguity

//interface supports multiple inheritance
//as from java 8 we have method declarations in interface , same problem araises 

interface Demo1 {
	void abc();

	default void show() {
		System.out.println("in demo show");
	}
}

interface MyDemo {

	default void show() {
		System.out.println("in demo show");
	}
}

class DemoImple implements Demo1, MyDemo {
	public void abc() {
		System.out.println("abc from class");
	}
	
//	public void show() {
//		System.out.println("show from DemoImple class");
//	}
	
	@Override
	public void show() {
		Demo1.super.show();
		//MyDemo.super.show();
	}
}

public class KMultipleInheritanceIssueWithInterface {
	public static void main(String[] args) {
		Demo1 obj = new DemoImple();
		obj.abc();
		obj.show();
	}
}


/*
if we have same default method defined in both interfaces and inherited into a class
then class will give compiletime error as 
Duplicate default methods named show with the parameters () and () are inherited from the types MyDemo and Demo1

this is again ambiguity problem which araises
solution for this create a method inside class , thus removes ambiguity 
we have 2 ways to overcome ambiguity
method1:
define method inside class
//	public void show() {
//		System.out.println("show from DemoImple class");
//	}
 
method 2:
is to override the method and provide interfaceName.super.methodname

@Override
	public void show() {
		Demo1.super.show();
		//MyDemo.super.show();
	}
	
	
this solves ambiguity
*/
