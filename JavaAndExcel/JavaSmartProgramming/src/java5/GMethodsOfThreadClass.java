package java5;

public class GMethodsOfThreadClass {

	public static void main(String[] args) {//main thread is created by JVM
		System.out.println("hello");
//		System.out.println(10/0);//Exception in thread "main" java.lang.ArithmeticException:
		System.out.println(Thread.currentThread().getName());//main
		
		Thread.currentThread().setName("Apple");
		System.out.println(Thread.currentThread().getName());//Apple
		
//		System.out.println(10/0);//Exception in thread "Apple" java.lang.ArithmeticException:
	}
}

//class Testy extends Thread{
//	
//	public void run() {
//		System.out.println("Thread task");
//		System.out.println(Thread.currentThread().getName());//Thread-0
//	}
//	public static void main(String[] args) {
//		Testy t = new Testy();
//		t.start();
//		System.out.println(Thread.currentThread().getName());
//	}
//}
