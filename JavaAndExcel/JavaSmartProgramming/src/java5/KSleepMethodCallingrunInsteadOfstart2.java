package java5;

public class KSleepMethodCallingrunInsteadOfstart2 extends Thread {

	public void run() {
		try {
			for(int i=1;i<=5;i++) {
				System.out.println(i+" "+Thread.currentThread().getName());
				Thread.sleep(1000);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		KSleepMethodCallingrunInsteadOfstart2 t1 = new KSleepMethodCallingrunInsteadOfstart2();
		
		t1.start();
		KSleepMethodCallingrunInsteadOfstart2 t2 = new KSleepMethodCallingrunInsteadOfstart2();
		t2.start();
	}
}
//creates Thread if we use start() method and executes in 5 seconds
