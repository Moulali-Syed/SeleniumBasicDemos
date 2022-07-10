package java5;

//join() method
/*
 join() method - if a thread wants to wait for another thread
 to complete its task , then we should use join() method
 
 suppose we have t2 waiting for t1 , t3 waiting for t2
 
 methods: we have 3 overloaded methods
 public final void join() throws InterruptedException{
 
 }
 
 public final synchronized void join(long ms){
 
 }
 
 public final synchronized void join(long ms,int ns){
 
 }
 
 
 */
public class MjoinMethod extends Thread {
	public void run() {
		try {
			for(int i=1;i<=5;i++) {
				System.out.println("child thread "+i);
				Thread.sleep(1000);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		MjoinMethod t = new MjoinMethod();
		t.start();
		
		try {
			for(int i=1;i<=5;i++) {
				System.out.println("main thread "+i);
				Thread.sleep(1000);
//				if we want the thread to complete and main thread to wait 
				t.join();
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}

/*
 output:
main thread 1
child thread 1
child thread 2
child thread 3
child thread 4
child thread 5
main thread 2
main thread 3
main thread 4
main thread 5
*/