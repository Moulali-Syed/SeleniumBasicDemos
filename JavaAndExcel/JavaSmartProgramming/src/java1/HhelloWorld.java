package java1;

public class HhelloWorld {

 	public static void main(String[] args) {
		System.out.println("Hello World");
	}

}

/*
 * class - is a keyword , always we need class for a java program
 *
 * access modifer class ClassName{
 * 		//body
 * }
 *
 * we can have any number of classes inside a class
 *
 * we can have only one public class in a file
 *
 *
 * ==========================
 * HhelloWorld - is identifier
 * classname must start with capital letter
 *
 * ==============================
 *
 * public - is access modifier , here we r using because JDK can access it
 *
 * static - keyword  , used so that JVM can call without any object creation
 *
 * void - return type , void means nothing
 *
 * main - method name [entry point for java program]
 *
 * execution starts from main method
 *
 * String - is class , because in java all operations[processing] happen as string ,
 * 				because string in immutable
 *
 * args -  arguments
 *
 *
 * System - is a class  from java.lang package
 * out - is static variable of PrintStream class , present inside System class
 * println - method present in PrintStream class , PrintStream class  has 3 methods
 * 				print()  println()   printf()
 *
 * print() -  to print
 * println() - print in new line[cursor in new line]
 * printf() - format specifiers can be used like %d %s
 *
 *
 * some acceptable changes in main method
 * static public void main(String[] args)
 *
 * we can decalre string in any acceptable form
 * String[] args
 * String args[]
 * String []args
 *
 * args can be any name
 *
 * we can use varargs instead of String[] args
 * main(String... args)
 *
 * we can use final , synchronized , strictfp with main method
 *
 *
 *
 * ========================
 * we save as ClassName.java
 *
 * open cmd
 * write javac
 * if so many commands or visible then ok
 * if not provide jdk bin path
 * set path = "C:/.../bin"
 *
 * goto program path
 * cd programpath
 *
 * compile
 * javac fileName.java
 *
 * generates a fileName.class file
 *
 *
 * run
 * java fileName
 *
 * displays output
 *
 *
 * .class file will be generated with the same name as className
 * suppose
 * class ABC{
 *
 * }
 *
 * saved as Xyz.java
 *
 * on compile
 * javac Xyz.java
 *
 * creates ABC -- class file
 *
 * to run
 * java ABC
 *
 * ===================================
 *
 * suppose my java file has 2 classes
 *
 *  class Aa{
 *      public static void main(String[] args){
 *  		System.out.println("hello");
 *  	}
 *  }
 *  class Bb{
 *
 *  }
 *
 *  and saved as Xyz.java
 *
 *  on compile creates a 2 .class files
 *
 *  Aa.class and Bb.class
 *
 *  Now when we run
 *  java Aa
 *  we get "hello"
 *
 *  java Ba
 *  error: main method not found in class Bb
 *
 */

/*
 * Flow of execution of java file
 *
 *
 * jdk installed in C drive
 * create java source file - Abc.java
 * open cmd , compile and run
 *
 * javac Abc.java
 * java Abc
 *
 * JVM - interpreter+JIT compiler - output in cmd
 *
 *
 *
 *
 */
