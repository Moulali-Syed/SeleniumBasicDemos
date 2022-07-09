package java4;

public class RStringBuilderClassMethods {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		StringBuilder sb1 = new StringBuilder();
		
		System.out.println(sb1.capacity());//16
	}
}
/*
StringBuffer - mutable String will be created , all methods are synchronized in this class
Thread safe , performance decreases

Synchronization in java guarantees that no two threads can execute a synchronized method
which requires the same lock simultaneously or concurrently
and thus synchronization increases waiting time of thread and effects performance of system

To overcome problem of slow performance of StringBuffer methods,java introduced
StringBuilder concept in java jdk 1.5 and creates all methods of StringBuilder as
non-synchronized which increases the methods performance

StringBuilder - same as StringBuffer  , can create mutable objects but methods are
non synchronized , performance increases , not thread safe , present in java.lang package

*/