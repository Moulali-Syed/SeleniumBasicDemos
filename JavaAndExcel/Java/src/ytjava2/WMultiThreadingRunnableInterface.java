package ytjava2;

class Hi1 implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hi");

			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}

}

class Hello1 implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hello");
		}
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}

	}

}

public class WMultiThreadingRunnableInterface {
public static void main(String[] args) {
	Hi1 obj = new Hi1();
	Hello1 obj1 = new Hello1();
	
	Thread t1 = new Thread(obj);
	Thread t2 = new Thread(obj1);
	
	t1.start();
	t2.start();
}
}

/*
 * Run is a functional interface which has only one method - run
 * 
 */