package OOPDemos;

public class Demo01 {

	static int a=10;
	int b=15;
	public static void main(String[] args) {
//		System.out.println("Hello Iam from main method");
		System.out.println(a+"from main");
		Demo01.sta();
	}
	
	static {
//		System.out.println("Iam from static block -1");
		System.out.println(a+"from static block -1 ");
		
	}
	
	static {
		a=20;
//		System.out.println("Iam from static block -2 ");
		Demo01.sta();
		System.out.println(a+"from static block -2");
	}
	
	static void sta() {
//		System.out.println("Iam from a static method");
		System.out.println(a+"from static method");
	}
	
	
}
