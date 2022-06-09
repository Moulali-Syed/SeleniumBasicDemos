package ytjava2;


interface Abc{
	
	void show();
}

class Implementor implements Abc{
	public void show() {
		System.out.println("anything");
	}
}
public class FInterface4 {

	public static void main(String[] args) {
		//API is like an interface
		
		Abc obj = new Implementor();
		obj.show();
	}
}
