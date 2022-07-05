package java1;

public class BVariables {
	
	//variables in java
	int a =10;
	/*
	 * 
	 * In java variable is a piece of memory that can contain a datta value
	 * a variable thus has a datatype
	 * 
	 * variables are typically used to store information which ur java program
	 * needs to do its job
	 * 
	 * int a = 10;
	 * 
	 * 
	 * 
	 * a is variable
	 * 10 is literal
	 * 
	 * 
	 * value of variable can be changed
	 * 
	 * a = a + 20
	 * 
	 * 
	 * varibales are 3 types
	 * 
	 * local
	 * instance
	 * static
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	//instance variable
	int b =20;
	static int c =30;//static varibale
	void add() {
		 int d =40,e;//local variable
		e = b+c+d;
		System.out.println(e);
		
	}
	
	void mul() {
		 int f=50,g;//local variable
//		g = b*c*d*f;  d cannot be used here
		g= b*c*f;
		System.out.println(g);
	}

	public static void main(String[] args) {
		BVariables obj = new BVariables();
		
	}
	
	//instance and static variables have more scope
	//******************************************************************************//
	//local variables can be declared inside methods , constructors,blocks
	//scope is inside methods , constructors,blocks and not outside
	//when method, constructor or block gets executed variables allocated memory
	//when gets exit , variables destroyed
	//stored memory: stored in stack memory
	//default values: doesnot have any default values
	//values must be provided before use
	//access specifiers : access specifiers cannot be used with local variables
	//******************************************************************************//
	//******************************************************************************//
	/*
	 * instance variables:
	 * declared inside class but outside methods , constructors, blocks
	 * can be used: inside all methods , blocks , constructors within  a class
	 * memory allocation: when object is created memory allocates and object is
	 * destroyed then memory releases
	 * stored memory: heap memory
	 * default values: they have default values 
	 * 	int -0 boolean - false , object - null
	 * 
	 * access specifiers: can be used
	 * how to access:simple instance variable , can be called directly
	 * 
	 */
	//******************************************************************************//
	
	//******************************************************************************//
	/*
	 * static values
	 * decalrations:
	 * within class but outside constructor,method,blocks 
	 * with static keyword
	 * 
	 * scope:
	 * similar to instance variables
	 * inside all methods , blocks , constructors within  a class , including static methods
	 * 
	 * memory allocated:
	 * when we run program and .class file is loaded , static variables allocated memory
	 * when .class file unloaded , sttatic variables gets destroyed
	 * 
	 * stored memory:
	 * in non-heap memory or static memory
	 * 
	 * default values: similar to instance variables
	 * 
	 * access specifiers: can be used public , private , protected
	 * 
	 * how to access : directly , by using class name , by object reference
	 */
	
	//******************************************************************************//

}
