package ytjava2;

public class NAccessModifiers {

	// in java we have access modifiers
	
	
	/*
	 * public
	 * abstract
	 * private
	 * public
	 * protected
	 * 
	 * 
	 * with class we can only use final abstract public
	 * we cannot use private and protected class
	 * 
	 * inner class can be private
	 * 
	 * we can have 
	 * class A{
	 * 
	 * } //this is default class
	 * 
	 * public class B{
	 * 
	 * }
	 * 
	 * if we have 
	 * 
	 * package com.abc;
	 * class A{
	 * 
	 * }
	 * 
	 * package com.abc;
	 * public class Abc{
	 * 	public static void main(){
	 * 	    A obj = new A();
	 *    //as both A and Abc are in same package we are able to create object
	 *		// but if the class A is in a different package say com.abcd , we will get a compilation error
	 *       //saying class is not visible , if we want to access class from a different package we must
	 *       //mark the class as public
	 * }
	 * 
	 * }
	 * 
	 * 
	 *   //methods can be public private default protected
	 *   if we r not specifying anything then method will be marked as default - then we cannot access it outside package
	 *   
	 *   
	 *   we can have private methods
	 *   
	 *   
	 *   package com.abcd;
	 *   public class A{
	 *   	public void method1(){
	 *   method2();
	 *   }
	 *   private void method2(){
	 *   System.out.println("Hi");
	 *   }
	 *   
	 *   }
	 *   package com.abc;
	 *   import com.abcd.A;
	 *   public class Abc{
	 *   	public static void main(String[] args){
	 *   	A obj = new A();
	 *   	obj.method();
	 *   }
	 *   }
	 *   
	 *   
	 *   private : Specific class
	 *   Default : Specific package  - package private
	 *   public : any class or package
	 *   protected : subsiding class - all classes in the present package ,inheriting classes from other packages can access
	 */
}


/*
 * package com.demo.test
 * public class Student{
 * 
 * 	public int rollno=8; //can be access anywhere in any package
 * int r1 = 12;//has default access can be accessed only with in the package
 *  //if i create object of class Student , in some other class with in package i can access r1 , but from a different
 *  //package we cannot access default variables , if we want to access from other package it should be public
 * private String name; //can be used in same class
 * 
 * 
 * protected int marks =100;
 *  //can be accessed in same package , and in other packages only those which inherit the class 
 *  //protected members can be accessed from sub class of other package
 * }
 */
