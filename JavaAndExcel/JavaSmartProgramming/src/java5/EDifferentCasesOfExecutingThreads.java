package java5;

/*
 1..performing single task from single thread -  we have seen earlier
 2. performing single task from multiple thread
 3.performing multiple task from single thread
 4.performing multiple task from multiple thread
 */
public class EDifferentCasesOfExecutingThreads {

}
//1..performing single task from single thread
class Testt extends Thread{
	public void run() {
		System.out.println("thread task");
	}
	public static void main(String[] args) {
		Testt t = new Testt();
		t.start();
	}
	//2 threads r created , 1 by us, 1 by JVM[main thread]
}
// 2. performing single task from multiple thread
class Testt1 extends Thread{
	public void run() {
		System.out.println("thread task");
	}
	public static void main(String[] args) {
		Testt1 t = new Testt1();
		t.start();
		Testt1 t1 = new Testt1();
		t1.start();
	}
	//here 3 threads are created , one is main Thread created by JVm
	//2 r created by Thread class
}


// 3.performing multiple task from single thread - this is not possible
//because thread cannot be divided further


// 4.performing multiple task from multiple thread
class MyThread1 extends Thread{
	public void run() {
		System.out.println("Task 1");
	}
	
}
class MyThread2 extends Thread{
	public void run() {
		System.out.println("Task 2");
	}
	
}
class Main{
	public static void main(String[] args) {
		//all threads execute at once
		MyThread1 t1 = new MyThread1();
		t1.start();
		MyThread2 t2 = new MyThread2();
		t2.start();
	}
}