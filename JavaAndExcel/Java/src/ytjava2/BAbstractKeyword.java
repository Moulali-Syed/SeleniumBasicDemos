package ytjava2;



//we cannot create object for abstract class
abstract class Human{
	
	
	public abstract void sleep();
	public void eat() {
		
	}
	
	public void walk() {
		
	}
}

class Man extends Human{ // this is Concrete class
	//its compulsory to define the abstract methods of parent class , if failed to do this class will also
	//become abstract
	public void sleep() {
		
	}
	
}

public class BAbstractKeyword {

	//we can use  in class and method
	
	//what is abstract class?
	//if we dont want to create an object of class , then mark that class as abstract
	
	//if we have a abstract method , it is compulsory that our class must marked as abstract
	public static void main(String[] args) {
		Human obj = new Man();
	}
}
