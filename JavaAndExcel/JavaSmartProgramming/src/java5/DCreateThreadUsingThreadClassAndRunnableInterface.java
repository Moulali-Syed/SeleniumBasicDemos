package java5;

//thread can be created in 2ways - Thread class | Runnable Interface

/*
package java.lang
public class Thread implements Runnable {

	//constructor
	 //methods
	 
	run();
	start();  
	 

}

package java.lang
public interface Runnable{
	//has only one method
	run() 
	 

}
*/
public class DCreateThreadUsingThreadClassAndRunnableInterface {

	public static void main(String[] args) {
		
	}
}

//creating Thread using Thread class
class Test extends Thread{//1
	
	public void run() {//2
		//task of thread
		System.out.println("Thread task");
	}
	
	public static void main(String[] args) {
		Test t = new Test();//3
		t.start();//4
		
		//we cannot invoke t.start() again - it throws java.lang.IllegalThreadStateException
	}
}

//create thread using Runnable Interface
class Test1 implements Runnable{//1
	public void run() {//2
		//task of thread
		System.out.println("Thread task here");
	}
	
	public static void main(String[] args) {
		Test1 t = new Test1();//3
		Thread th = new Thread(t);//4
		th.start();//5
		
		//because start method is in Thread class , we r creating its object and passing
		//the test class object as a parameter to it 
		//then using the Thread class object , call the start method[invoke thread]
	}
}

/*
 Which is better - Thread or Runnable?
 Runnable is better
 because in big projects , every class needs to inherit some other class
 if i want to create a thread for a class which is already inheriting
 then i can use Runnable interface , as java doesnot support multiple inheritance
  
 */
/*
Runnable is a Functional Interface
*/