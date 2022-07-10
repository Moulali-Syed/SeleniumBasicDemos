package java5;

/*
 * Every Thread has a priority - JVM will execute these threads based on priority
 * according to priority JVM allocates the processor
 * 
 * priorities are represented in form of integer values which range from 1-10
 * 1.MIN_PRIORITY
 * 5.NORM_PRIORITY
 * 10.MAX_PRIORITY
 * 
 * below are not priorities , BELOW are invalid priorities
 * 0, <1 ,>10 , MINIMUM_PRIORITY ,MAXIMUM_PRIORITY,LOW_PRIORITY,MEDIUM_PRIORITY,NORMAL_PRIORITY,HIGH_PRIORITY
 * 
 * 
 * Methods:
 * public final void setPriority(int value){
 * 
 * }
 * 
 * public final int getPriority(){
 * 
 * }
 * 
 * default nature: priorities are inherited from parent thread
 * by default main thread priority is 5
 * if priority is not between 1 to 10 then it will throw runtime exception
 * IllegalArgument Exception
 * 
 * If multiple threads have same priority , then it depends on JVM which thread to be executed
 * 
 * priorities depends on platform[windows doesnot support priorities]
 * 
 */
public class IThreadPriorities extends Thread {

	public void run() {
		System.out.println("child thread");
		System.out.println(Thread.currentThread().getPriority());//takes from parent only so -5
	}
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority());//5 - for main thread
		IThreadPriorities t = new IThreadPriorities();
		t.start();
		
		IThreadPriorities t1 = new IThreadPriorities();
		t1.setPriority(10);//we can set priority
		t1.start();
	}
}
