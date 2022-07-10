package java5;

public class NDifferenceBetweenSleepYieldJoin {

	public static void main(String[] args) {
		
		
	}
}
/*

property	sleep						yield					      join
purpose     if any thread				it stops current executing    if  a thread wants to wait for
			doesnot want to perform     thread and provide chance to   another thread to complete its
			any operation for 			another threads of same or     task
			particular time				high priority to execute


examples    blinking,timer,ppt,bulbs     shopping						license Dept

how thread   automatically after provided  automatically invoked by		automtically invokes after 	
invokes again time period					thread scheduler		    completion of another thread task
				if thread is interrupted								after completion of time period
																		if thread is interrupted
																		
methods		sleep(long ms)				yield()							join() , join(long ms)
			sleep(long ms,int ns)										join(long ms,int ms)
			
is methodOverloaded Yes					No								No
Exception     Yes-InterruptedException  No								yes-interruptedException

is method final  No						No								yes

is method static  yes					yes								No

is method native   sleep() - is native        yes						No
				   sleep(long ms,int ns) -not native
these 3 methods temporarily stops the thread execution
*/