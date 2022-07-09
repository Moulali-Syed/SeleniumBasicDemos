package java5;

public class BProcessvsThread {

}
/*
 Context switching is a process that involves switching of CPU from one process
or task to another In this phenomenon the execution of process that is present in running
state is suspended by kernel and another process that is present in ready state is executed
by CPU
it is one of effective features of multitasking operating system, the processes are switched
so fastly that it gives an illusion to user that all processes are being executed at same time


Synchronization
When we start two or more threads within a program there may be a situation when multiple
threads try to access same resource and finally they can produce unforeseen result due to
concurrency issues.for example , if multithreads try to write within a same file then they
may corrupt data because one of threads can override data or while one thread is opening  the same
file at same time another thread might be closing the same file
so in this type of situation we use synchronization
 */


/*
Process vs Thread

Process:
Definition - a program which is in executing state
process is heavy weight
Context switching takes more time
InterProcess communication takes more time
Address space: each process has different address space
Dependency - process are not dependent on each other
Synchronization - process dont require
Resource consumption is more
Time for creation is more for process
Time for termination is more

Thread:
Definition - sub part of process(small task)
Thread is low weight
Context switching takes less time
InterThread communication takes less time
Address space - threads share same address space
Dependency - thread depends on each other
Synchronization - thread requires synchronization
Resource consumption is less
Time for creation is less for Thread
Time for termination is less
*/