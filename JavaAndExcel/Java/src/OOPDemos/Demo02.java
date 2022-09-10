package OOPDemos;

public class Demo02 {
	
	int num;
	public Demo02(){
		num =10;
		System.out.println("inside constructor");
	}
	
	static {
		System.out.println("static block");
	}
	
	{
		System.out.println("A code block");
	}
	public static void main(String[] args) {
		System.out.println("main method");
		Demo02 obj1 = new Demo02();
		Demo02 obj2 = new Demo02();
	}
}
/*
 static block
main method
A code block
inside constructor
A code block
inside constructor
 */
