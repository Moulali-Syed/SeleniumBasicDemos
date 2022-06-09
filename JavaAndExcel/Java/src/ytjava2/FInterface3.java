package ytjava2;

interface Writer3 {

//	public void write() {
//
//	}
	
	//we can declare this method as abstract , so mark method as abstract
//	public abstract void write(); 
	//we can write
	void write();
}


//in java multiple inheritance is not possible , what if Pen2 needs to extend one more class , to achieve that
//we can the Writer2 as interface , and instead of extends use implements

//interface is same like abstract class , in abstract class we can have abstract methods and concrete methods
//in interface all methods are by default public abstract


//we cannot create object of interface , we can only create reference of interface
//we can achieve multiple inheritance , all methods are by default public abstract
class Pen3 implements Writer3 {
	public void write() {
		System.out.println("In a Pen");
	}
}

class Pencil3 implements Writer3 {
	public void write() {
		System.out.println("In a Pencil");
	}
}

class Kit3 {

	public void doSomething(Writer3 p) {
		p.write();
	}
}

public class FInterface3 {

	// interface

	public static void main(String[] args) {
		Kit3 k = new Kit3();
		Writer3 p = new Pen3();
		k.doSomething(p);
		Writer3 pc = new Pencil3();

		k.doSomething(pc);
		// k.doSomething(pc);//for this we have to create one more method ,
		// instead create a class with method , write() and extend in other 2 classes

	}
}


//we can create object of class and give interface reference
