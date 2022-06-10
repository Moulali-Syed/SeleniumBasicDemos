package ytjava3;

class Counter {

	int count;

	//synchronized makes method thread safe - so that only one thread can access at a time
	public synchronized void increment() {
		count++;
	}
}

public class AMultiThreadingSynchronizedKeyword {

	public static void main(String[] args) throws Exception{
		Counter c = new Counter();

//		c.increment();
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for (int i = 1; i < 1000; i++) {
					c.increment();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for (int i = 1; i < 1000; i++) {
					c.increment();
				}
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();//waits till threads completes its job
		//both the threads accessing the method , increment at same time
		//we want only one thread to work with a method we can mark that method as synchronized
		System.out.println("count " + c.count);
	}
}
