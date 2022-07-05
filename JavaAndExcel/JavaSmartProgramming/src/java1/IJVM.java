package java1;

public class IJVM {
	
	/*
	 * JVM [.class file comes to JVM]
	 * 
	 * 1.class loader 
	 * 		Loading - bootstrap class loader , extention class loader , application class loader
	 * 				.class files loaded to memory
	 * 
	 * 		Linking - verification , preparation [static variables will be allocated memory by this in method area]
	 * 					resolution[changes symbolic name references to original name references]
	 * 		Initialization - static values will be replaced in method areas , that is default to actual values
	 * 					and also execute static blocks from top to bottom 
	 * 
	 * 2.memory areas
	 * 		Method area: then this class comes to method area [stores class level data
	 * 						and executes static block]
	 * 		Heap Memory: then creates object of Class Class[present in java] in heap memory
	 * 					Objects , arrays will be stored in heap memory, instance variables also stored
	 * 
	 * 		Method area and Heap Memory - created once per JVM
	 * 
	 * 		stack area - local variables and current running methods are stored
	 * 		PC register - address of executing instructions
	 * 		native method area - native methods which are used in our application are stored
	 * 
	 * Method area , heap memory - not thread safe
	 * stack area ,PC Register , native method area - thread safe
	 * 
	 * 3.Execution Engine
	 * 		Interpreter : execute code line by line
	 * 		JIT Compiler : this will store the methods which are frequently getting executed
	 * 					and thus when called will execute without interpreting
	 * 					thus increase performance
	 * 					JIT has below components
	 * 					intermediate code generator
	 * 					Cache optimizer
	 * 					Target code generator
	 * 					native code /machine code
	 * 					profiler - to run frequently accessed code[hotspot methods] we use profiler
	 * 
	 * 		Garbage collection
	 * 		Security Manager
	 * 
	 * Execution Engine  connects with java Native interface 
	 * 		||
	 * Native Method libraries are accessed thru java native interface[JNI]
	 */

}
