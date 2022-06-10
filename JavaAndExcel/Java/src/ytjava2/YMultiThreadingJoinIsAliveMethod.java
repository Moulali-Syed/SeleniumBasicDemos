package ytjava2;

public class YMultiThreadingJoinIsAliveMethod  {

	public static void main(String[] args) throws Exception{

		Runnable obj = new Runnable() {
			public void run() {
				for (int i = 1; i <= 5; i++) {
					System.out.println("hi");
					try {
						Thread.sleep(500);
					} catch (Exception e) {
					}
				}
			}
		};

		Runnable obj1 = new Runnable() {
			public void run() {
				for (int i = 1; i <= 5; i++) {
					System.out.println("hello");
					try {
						Thread.sleep(500);
					} catch (Exception e) {
					}
				}
			}
		};

		Runnable obj2 = () -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println("hello...");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
				}
			}
		};
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj1);

		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		//join will wait till t1 and t2 join , that is both complete their execution
		
		System.out.println(t1.isAlive());
		//isAlive helps in knowing whether a thread is in running state or not - returns true/false
		System.out.println("bye");

	}
}
