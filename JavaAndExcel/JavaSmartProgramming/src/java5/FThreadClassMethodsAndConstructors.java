package java5;
/*

public class Thread implements Runnable{

//constructors
 	Thread();//default constructor
 	Thread(Runnable target);//we r using in Runnable implements 
 	Thread(String name);//to provide name for Thread
 	Thread(Runnable target,String name);//using Runnable interface and also provide a name
 	Thread(ThreadGroup tg,Runnable target);-------------------------------------
 	Thread(ThreadGroup tg,String name);									to use in ThreadGroup
 	Thread(ThreadGroup tg,Runnable target,String name);					we can use these 4 constructors
 	Thread(ThreadGroup tg,Runnable target,String name,long stackSize);--------
 	
 //methods
  
  	//basic methods
  	run();
  	start(); - synchronized method
  	currentThread();//static method - returns thread reference, native Thread
  	isAlive();//thread is dead or not returns true or false
	
	//naming methods
	getName();
	setName(String name);
	
	//daemon thread methods
	isDaemon();
	setDaemon(boolean b);//if set to true the thread we r creating will become daemon thread
	
	//priority based methods
	getPriority()
	setPriority(int p);//set thread priority
	
	//preventing thread execution methods
	sleep(long millis) - native method [written in someother language]
	yield() - native method [written in someother language]
	join()
	
			---	suspend()
				resume()
				stop()
				destroy()----- 4 r deprecated now
	
	//interrupt thread
	interrupt()
	isInterrupted()
	inInterrupted()
	
	

}

class Object{

		//interThread communication - these 3 are object class methods but used for Thread
	 wait()
	 notify()
	 notifyAll()
}

class Test extends Thread{

	public void run(){
		sop("task");
	}
	
	public static void main(String[] args){
		Test t = new Test();
		t.start();
	}
}

class Test implements Runnable{

	public void run(){
		sop("task");
	}
	
	public static void main(String[] args){
		Test t = new Test();
		Thread th = new Thread(t);
		th.start();
	}
}
 */
public class FThreadClassMethodsAndConstructors {

}
