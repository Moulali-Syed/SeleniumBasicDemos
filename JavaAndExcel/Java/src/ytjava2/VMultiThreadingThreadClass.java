package ytjava2;

class Hi extends Thread {
	public void run()  {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hi");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Hello extends Thread{
	public void run()  {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hello");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}

public class VMultiThreadingThreadClass {

	public static void main(String[] args) throws InterruptedException {
		Hi obj = new Hi();
		Hello obj1 = new Hello();

		obj.start();
		obj1.start();
		
	}
}

/*
 * step1: extend class with Thread
 * step2: define run() method and write code inside it
 * step3: call start method this internally calls run method
 */
