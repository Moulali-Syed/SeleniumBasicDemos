package ytjava2;


class Writer{
	
	public void write() {
		
	}
}
class Pen1 extends Writer{
	public void write() {
		System.out.println("In a Pen");
	}
}

class Pencil1 extends Writer{
	public void write() {
		System.out.println("In a Pencil");
	}
}

class Kit1 {

	public void doSomething(Writer p) {
		p.write();
	}
}

public class FInterface1 {

	// interface
	
	
	public static void main(String[] args) {
		Kit1 k= new Kit1();
		Writer p = new Pen1();
		k.doSomething(p);
		Writer pc = new Pencil1();
		
		k.doSomething(pc);
		//k.doSomething(pc);//for this we have to create one more method  , 
		//instead create a class with method , write() and extend in other 2 classes
		
	}
}
