package ytjava;

class Outer {  //Outer.class
	int a;

	public void show() {
		System.out.println("Show method from Outer class");
	}

	class Inner {    //Outer$Inner.class
		public void display() {
			System.out.println("display emthod from inner class");
		}
	}
}

public class NInnerClassDemo {  //NInnerClassDemo.class

	// we can have varibales and methods
	public static void main(String[] args) {
		Outer obj = new Outer();
		obj.show();

		Outer.Inner obj1 = obj.new Inner();
		obj1.display();
	}
}


//Inner class - we need a class only to work with one specific class , we create a class inside a class
//to access methods inside a inner class , we have to use OuterClassName.InnerClassName  - Outer.Inner obj1
//to create object we have to use OuterClassObject.new Inner();   -  obj.new Inner();