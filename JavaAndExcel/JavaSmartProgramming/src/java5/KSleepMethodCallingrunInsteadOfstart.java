package java5;

public class KSleepMethodCallingrunInsteadOfstart extends Thread {

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
		KSleepMethodCallingrunInsteadOfstart t1 = new KSleepMethodCallingrunInsteadOfstart();
		
		t1.run();
		KSleepMethodCallingrunInsteadOfstart t2 = new KSleepMethodCallingrunInsteadOfstart();
		t2.run();
	}
}
//if we use run() instead of start() , thread will not be created and main thread only executes
//and takes 10 seconds