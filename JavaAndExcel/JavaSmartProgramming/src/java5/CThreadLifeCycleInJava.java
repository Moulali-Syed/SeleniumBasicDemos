package java5;

//how to create thread in java by extending thread class
public class CThreadLifeCycleInJava {

}

/*
there are 2 ways to create Thread

1.Thread class - is in java.lang package
2.Runnable Interface


steps to create Thread
1.extends the Thread class
2.override the run method
3.create object of class 
4.start the thread , using the object



class Test extends Thread{//1

	public void run(){//2
	
	}
	public static void main(String[] args){
	
		Test t = new Test();//3
		t.start();//4
	}

}

Life cycle of Thread: Total 5 stages

create thread ----> Runnable stage ------> Running--->dead
						|						|
						 -------NonRunnable-----
						    	   state
						    	   
create Thread [step3] ,then start thread [step4]--> Runnable --->then JVM allocates
the processor -----> now thread is Running ---when task is completed----> dead
after running , sometimes it may come to non runnable state , like we may keep it
sleep , or waiting for other thread , or lock ,or suspend ,then it  moves to Runnable then to
Running

Stage1:					 					Stage2					
Person is born	--p.start()--------->Person in RunnableState---person Selected for job---


			Stage3														Stage4
---->person in runnable state -----when person completes its task---->Dead State

	When person does not want to perform any task[Stage5 - NonRunnable State]
*/