package ytjava2;

public class UMultiThreading {

}


/*
we can go up with muitiple tasks same time 
listening music , wrtitng ms word doc
2 tasks at a time multi threading

MS Word - when we r typing , we can see it will highlight errors 

use of threads:
we  r having multi core processors , octa core we have 8 cores , when we create any java application

we r using one thread , when we get any exception we see Exception in Thread

we have an array of 500 elements , we want to multiply it to 2 , say it takes 8 sec if using one core
else we can create 4 threads and work on it and run in parallely , thus complete in 2 seconds

we can see android phone , amazon app , search shoe request go to server , then beside main thread a 
new thread will be created and send request


in java we have servlets , when we send request from client to server , we have threads there also

all codes , async actions , web applications building - thread are used

Thread t1 = new Thread();
this will create a thread

but this thread dont know what to do , so we need a class


Thread t1 = new Thread();
t1.run();
we can make thread sleep using Thread.sleep(2000)
class MyThread extends Thread {          --------------------[1]
	int[] values = {3,1,2,8,6};
	public void run(){  -------------------------------------------[2]
	
	for (int i=0;i<5;i++){
		values[i] = values[i]*2;
		}
	}
}


suppose i have a class which is already extends some classs , in java we dont have multiple inheritance
so we can achieve thread using Runnable Interface


class MyThread extends A implements Runnable {          --------------------[1]
	int[] values = {3,1,2,8,6};
	public void run(){  -------------------------------------------[2]
	
	for (int i=0;i<5;i++){
		values[i] = values[i]*2;
		}
	}
}

*/