package ytjava;

class A3 {
	public void show() {
		System.out.println("in class A3");
	}
}

class B3 extends A3 {
	public void show() {
		System.out.println("in class B3");
	}
	
	public void config() {
		System.out.println("Config");
	}
}

class C extends A3{
	public void show() {
		System.out.println("in class C");
	}
}

public class XDynamicMethodDispatch {
	public static void main(String[] args) {
		
		//parent class reference , child class object
		A3 obj = new B3(); //run time polymorphism
		//on calling method we get child class method , this is dynamic method dispatch , method invocation depends on the object
		obj.show();
		
		//calling a method which is not present in reference class is not possible
		//obj.config();  //will give error as The method config() is undefined for the type A3
		
		obj = new C();
		obj.show();//dynamic method dispatch
	}

}

//reference of parent class , object of sub class