package ytjava;

public class IClassAndObject {

	int num1;
	int num2;
	int result;

	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public void sub(int a, int b) {
		System.out.println(a - b);
	}

	public void perform() {
		result = num1 + num2;
	}

	public static void main(String[] args) {
		// everything in new real world is object , class is a blue print

		IClassAndObject obj = new IClassAndObject();
		obj.add(10, 20);
		obj.sub(20, 10);

		obj.num1 = 90;
		obj.num2 = 12;
		obj.perform();
		System.out.println(obj.result);
	}
}
