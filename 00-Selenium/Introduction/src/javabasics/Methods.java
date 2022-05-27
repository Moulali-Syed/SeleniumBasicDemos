package javabasics;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//why method in java
		Methods d = new Methods();
		d.getData();
		String data = d.sayHello();
		System.out.println(data);
		
		Methods1 d1 = new Methods1();
		d1.getUserData();
		
		//private methods not accessible outside class
		
		//to accesss methods without creating object we can use static methods
		Methods.sayHello1();
	}
	
	public void getData() {
		System.out.println("Hello World");
	}
	public String sayHello() {
		String wish = "Hello There!!";
		return wish;
	}
	
	public static String sayHello1() {
		String wish = "Hello There!!";
		System.out.println(wish);
		return wish;
	}

}
