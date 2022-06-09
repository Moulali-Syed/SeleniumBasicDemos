package ytjava2;

class Z {
	public void show() {
		System.out.println("in A show");
	}
}



public class GAnonymousInnerClass {

	public static void main(String[] args) {
		Z obj = new Z() {
			public void show() {
				System.out.println("Iam the best");
			}
		};
		obj.show();
		//now the show method will call the anonymous class show method
	}

}
/*
class A {
	public void show() {
		System.out.println("in A show");
	}
}

class B extends A {
	public void show() {
		System.out.println("Iam the best");
	}
}
If our only purpose is to override a method , we can use anonymous class

Z obj = new Z() {
			public void show() {
				System.out.println("Iam the best");
			}
		};
		
		
		anonymous class is only for one time use
*/
