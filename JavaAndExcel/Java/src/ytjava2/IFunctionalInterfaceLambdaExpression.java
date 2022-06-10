package ytjava2;

//Types of interface
//1.Normal interface - which has more than one method in it
//2.Single abstract method - which has only one method
//3.Marker Interface - which doesnot have any methods , we have inbuuilt Serializable interface

//from java 8 instead of calling Single abstract method interface we are having Functional interface ,
//it has only one method  . with this we have Funtional Interface Lambda Expression

@FunctionalInterface
interface Abc2 {
	void show();
}

public class IFunctionalInterfaceLambdaExpression {

	public static void main(String[] args) {

		// from java 8 , instead of defining this way of method in object declaration we
		// r using lambda
		// expression , to avoid boiler plate code
		Abc2 obj = new Abc2() {
			public void show() {
				System.out.println("hello");
			}
		};

		// instead use lambda expression
		Abc2 obj2 = () -> {
			System.out.println("hello");

		};

		// we can further write as
		Abc2 obj3 = () -> System.out.println("hey");

		obj3.show();
	}
}
