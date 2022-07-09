package java1;

public class FHistoryOfJava {

	/*
	 *
	 * what is java?
	 * java is a high level programming language , object oriented
	 * java is platform independent , it has its own run time
	 * environment .JVM provides a platform which accepts
	 * byte code and executes on machine
	 *
	 *
	 * history of java?
	 * James gosling , by sun microsystems company  , in 1991 , named it Oak
	 *
	 * in 1995 - java alpha beta version
	 * 1996 - JDK 1.0
	 *
	 * java license is now with Oracle
	 *
	 */

	/*
	 *
	 * java - platform independent
	 * write once run anywhere
	 *
	 *
	 * java is portable , .class file can run on any platform
	 *
	 * java is secure , JVM is a java virtual machine its basic role is to verify
	 * bytecode before its run , this makes sure that program isn't making
	 * any unsafe operations .there are various unsafe operations that programs
	 * can generally perform ; for example a program might branch to incorrect
	 * locations that can contain data rather than instruction the JVM ensures that
	 * such unsafe operations arent being performed
	 *
	 * over and above task the JVM also enforces runtime constraints
	 * this can include array bounds checking and others like it reduces the chances
	 * of developers suffering from memory safety flaws hence they can avoid such flaws
	 * as buffer overflow or others ; which makes java more secured language as compared
	 * to other langauges
	 *
	 *
	 * Security Manager:
	 * security manager layer is present in JVM ,it makes sure that untrusted code doesnt
	 * manage to access some APIs and features of platform
	 *
	 * No pointers:
	 * java doesnot support pointers(c & c++ supports)
	 * some of the arbitrary memory locations can be addressed with help of pointers
	 * for doing read and write operations which are unauthorized this doesnot
	 * serve purpose of being secured .that is why users donot use concept of pointers
	 *
	 * access modifers:
	 * there are 4 access modifiers in java
	 * public protected private default
	 * so as developer if we want to hide some code then we can use access modifers
	 * if we want that our code or data shouldnot be override then we can use
	 * final keyword which again adds security to java
	 *
	 *
	 * exception handling
	 * catch the results which are unexpected through exception handling and report
	 * the error to programmmer , until the rectification of error to programmer
	 * this concept will not allow us to run code , there by providing java security
	 *
	 * Own memory management:
	 * the memory management mechanism is unique and is owned by java there is no need for
	 * manual intervention for garbage collection and everything is handled automatically
	 * there is no need for headache to free memories it drastically reduces programmer overhead
	 *
	 * therefore programmers hand must be free from memory management.relieving memory
	 * in java is job of JVM
	 *
	 *
	 *
	 * java is Object oriented
	 * Robust - apps crash is less
	 *
	 * multithreading
	 *
	 * simple as compared to  C and C++
	 *
	 */

	/*
	 * use of java:
	 * android applications
	 * financial servies industries - payment gateways
	 *
	 * java web applications : ecommerce, health web apps
	 * software tools : intellij IDE , eclipse , netbeans
	 *
	 * big data technologies: many social networking websites like fb , twitter
	 *
	 * scientific applications : because safe,portable , maintainable
	 * J2ME applications: nokia , samsung handsets
	 * embedded systems: printers, routers , atms , home security systems all uses java a lot
	 */
}
