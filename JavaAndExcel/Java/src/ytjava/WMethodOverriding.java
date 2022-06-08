package ytjava;

class A2 {

	int i=10;
	public void show() {
		System.out.println("in a");
	}
}

class B1 extends A2 {

	
	//what if i mistakenly write show1 instead of show - where my intention is to override parent class
	//show method , if iam not specifyin @Override annotation , it will lead to calling the parent class method
	//thus causing error , if we provide @Override we will get compile time error , if by mistake we spell
	//method name wrong - thus overcome logical error 
	@Override
	public void show() {
		
		
		//calling parent class instance variable
		System.out.println(super.i);
		//calling super class method
		
		super.show();
		System.out.println("in B");
	}
}

public class WMethodOverriding {
	public static void main(String[] args) {
		B1 obj = new B1();
		obj.show();

//child class method overriding parent class method is called method overriding

	}
}
