package ytjava2;


interface Abc1{
	
	void show();
}

public class HAnonymousClassWithInterface {

	
	public static void main(String[] args) {
		Abc1 obj = new Abc1() {
			public void show() {
				System.out.println("anything");
			}
		};
	}
}

//we can create object of interface using anonymous class
