package java5;

public class GTesty extends Thread{
	
	public void run() {
		System.out.println("Thread task");
		System.out.println(Thread.currentThread().getName());//Thread-0
	}
	public static void main(String[] args) {
		GTesty t = new GTesty();
		t.setName("Apple");
		t.start();//creates Apple Thread
		
		GTesty t1 = new GTesty();
		t1.start();//creates Thread-1
		System.out.println(t1.isAlive());//true , it may also return false depend on execution of code
		System.out.println(Thread.currentThread().getName());//main
	}
}