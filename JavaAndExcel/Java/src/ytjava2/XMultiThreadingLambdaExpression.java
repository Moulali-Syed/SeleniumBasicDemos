package ytjava2;

//if the only purpose of a class is to implement a interface and provide one method definition
//we can do that using anonymous class

public class XMultiThreadingLambdaExpression {
	public static void main(String[] args) {

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

	}

}
