package ytjava2;

class Pen {
	public void write() {
		System.out.println("In a Pen");
	}
}

class Pencil {
	public void write() {
		System.out.println("In a Pencil");
	}
}

class Kit {

	public void doSomething(Pen p) {
		p.write();
	}
}

public class FInterface {

	// interface
	
	
	public static void main(String[] args) {
		Kit k= new Kit();
		Pen p = new Pen();
		k.doSomething(p);
		Pencil pc = new Pencil();
		//k.doSomething(pc);//for this we have to create one more method 
		
	}
}
