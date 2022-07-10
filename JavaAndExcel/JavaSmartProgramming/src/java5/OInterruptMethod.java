package java5;

/*
 * interrupt method is used to interrupt a executing thread
 * it will work only when thread is in sleeping [sleep()] or waiting[wait()] state
 * if thread is not in sleeping or waiting state then calling interrupt() method will
 * perform normal behaviour
 * 
 * when we use interrupt() method it throws InterruptedException
 * 
 * syntax:
 * public void interrupt(){
 * 
 * 
 * }
 */
public class OInterruptMethod extends Thread {

	public void run() {
		try {
			for(int i=1;i<=5;i++) {
				System.out.println(i);
				Thread.sleep(1000);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		OInterruptMethod t = new OInterruptMethod();
		t.start();//once thread started and then entered sleep mode
		t.interrupt();//this interrupt method will execute which inturn execute the catch block
		//if we comment Thread.sleep() inside the run [Thread-0] then program execute in normal flow
		//without throwing any exception
	}
}
