
class A {
	int i;

	public A(int i) {
		this.i = i;
	}

	public A() {

	}
}

public class Demo extends A {
	public Demo(int i) {
		super(i);
	}

	public Demo() {
		System.out.println("non parametrized constructor");
	}

	public static void main(String[] args) {
		Demo obj = new Demo();

	}
}
