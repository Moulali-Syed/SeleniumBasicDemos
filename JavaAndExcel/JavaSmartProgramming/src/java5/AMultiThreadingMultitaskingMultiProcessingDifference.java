package java5;

public class AMultiThreadingMultitaskingMultiProcessingDifference {

}

/*

MultiTasking:
performing multiple tasks at single time

suppose i am working in word and browsing thru browser in a computer

			VLC   word    Browser
			 |	    |        |
			 ----       ------
			       OS
			        |
			       CPU 
It increases performance of CPU
achieved in 2 ways
using MultiProcessing and MultiThreading

process based[MultiProcessing] and thread based[MultiThreading]


*/

/*
MultiProcessing: one System connected with multiple CPU , it is multiprocessing to complete a task

					OS
				  /  |  \
				   
				CPU CPU CPU
It is best suitable at system level or OS level
*/

/*
MultiThreading
executing multiple threads at single time.

						VLC
						 |
			video music time progress bar
						 |
						OS
						 |
						CPU
		used in many softwares , animations , games
		
java provides predefined API for multithreading
Thread , Runnable Interface, ThreadGroup, Concurrency , ThreadPool
*/