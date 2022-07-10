package java5;

/*
 * interrupted vs isInterrupted 
 * interrupted() method is used to check whether a thread is interrupted or not
 * isInterrupted() method is used to check whether a thread is interrupted or not
 * 
 *  interrupted() method clears the interrupted status from true to false if thread is interrupted
 *  isInterrupted() method doesnot clears the interrupted status from true to false if thread is interrupted
 *  
 *  interrupted() method will change the result if called twice
 *  isInterrupted() method produces same result if called twice
 *  
 *  public static boolean interrupted(){
 *  
 *  }
 *  
 *  public boolean isInterrupted(){
 *  
 *  }
 */
public class PinterruptedvsisInterrupted extends Thread{
	public void run() {
		System.out.println(Thread.interrupted());//after returning the value, it changes the status
		try {
			for(int i=1;i<=5;i++) {
				System.out.println(i);
				Thread.sleep(1000);
				System.out.println(Thread.interrupted());//returns false
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
	public static void main(String[] args) {
		PinterruptedvsisInterrupted t = new PinterruptedvsisInterrupted();
		t.start();
		t.interrupt();
	}
}
