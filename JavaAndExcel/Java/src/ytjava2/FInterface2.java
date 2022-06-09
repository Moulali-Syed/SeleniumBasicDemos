package ytjava2;

interface Writer2 {

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
class Pen2 implements Writer2 {
	public void write() {
		System.out.println("In a Pen");
	}
}

class Pencil2 implements Writer2 {
	public void write() {
		System.out.println("In a Pencil");
	}
}

class Kit2 {

	public void doSomething(Writer2 p) {
		p.write();
	}
}

public class FInterface2 {

	// interface

	public static void main(String[] args) {
		Kit2 k = new Kit2();
		Writer2 p = new Pen2();
		k.doSomething(p);
		Writer2 pc = new Pencil2();

		k.doSomething(pc);
		// k.doSomething(pc);//for this we have to create one more method ,
		// instead create a class with method , write() and extend in other 2 classes

	}
}
