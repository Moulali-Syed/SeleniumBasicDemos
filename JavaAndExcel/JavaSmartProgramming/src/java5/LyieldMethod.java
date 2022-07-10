package java5;

/*
 1
 yield method - which stops current executing thread and gives a chance to
 other threads for execution
 
 suppose in a store , if i have so many items for billing , other person has only one item
 for billing then we provide opprtunity to him to bill
 
 2
 Working: java5 - internally it uses sleep()
 java6 - thread provides the hint to thread scheduler then it depends on thread scheduler to 
 		accept or ignore the hint
 
 3		
 Method:
 public static native void yield(){
 
 }
 */
public class LyieldMethod extends Thread {

	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
	
	public static void main(String[] args) {
		LyieldMethod t = new LyieldMethod();
		t.start();
		Thread.yield();//if u want main thread to stop and providr chance to other threads
		for(int i=1;i<=5;i++) {
			
			System.out.println("main Thread "+i);
		}
	}
	
}
/*
output: depends on Thread schedular , output may be different
main Thread 1
Thread-0 1
Thread-0 2
Thread-0 3
Thread-0 4
Thread-0 5
main Thread 2
main Thread 3
main Thread 4
main Thread 5
*/