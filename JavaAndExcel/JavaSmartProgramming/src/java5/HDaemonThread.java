package java5;

/*
 * 
 * Daemon threads - which run in background of another thread
 * it provides service to the threads
 * for example: garbage collector , finalizer , signal dispatchers,attach listeners ..etc
 * 
 * garbage collector ensure memory is free by deleting the unwanted objects , 
 * thus prevents the memory problems for main thread
 * 
 * methods: it has 2 main methods
 * public final void setDaemon(boolean b){
 * 
 * }//converts normal thread to daemon thread
 * 
 * public final boolean isDaemon(){
 * 
 * }//checks if a thread is Daemon or not - returns true or false
 * 
 * case1:
 * when ever we r creating Daemon thread we must ensure 
 * we should call this method first setDaemon(true); before start the thread
 * if not it will throw IllegalThreadStateException
 * 
 * case2:
 * we cannot create main thread as daemon thread
 * if u make main thread as daemon thread it will throw run time exception
 * 
 * Daemon thread life is dependent on the thread in whose background it is running
 * Daemon thread nature: it inherits properties from parent thread
 * JVM role in daemon thread:when all threads are dead , by any chance any daemon thread is
 * running JVM will make it dead and then JVM will shut down
 * most of times daemon threads have low priority , but we can change according to need
 */
public class HDaemonThread extends Thread{
	
	public void run() {
		System.out.println(Thread.currentThread().isDaemon());
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Daemon Thread");
		}else {
			
			System.out.println("Child Thread");
		}
	}
	public static void main(String[] args) {
		//if i comment this below print statement , then nothing will be running
		//because main thread is not doing any work , so what daemon will run in background 
		//when it is not even running
		System.out.println("main Thread");
		HDaemonThread t = new HDaemonThread();
		t.setDaemon(true);//we must set daemon , then start
		t.start();
		//after start we cannot set daemon , if tried will throw error
	}
}
