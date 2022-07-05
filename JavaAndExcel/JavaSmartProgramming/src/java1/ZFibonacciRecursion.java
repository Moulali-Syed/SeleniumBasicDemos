package java1;

public class ZFibonacciRecursion {

	static int a = 0, b = 1, c;

	public static void main(String[] args) {
		System.out.print(a+" "+b);
		ZFibonacciRecursion obj = new ZFibonacciRecursion();
		obj.printFib(10);
	}

	void printFib(int i) {
		if (i >= 1) {
			c = a + b;
			System.out.print(" "+c);
			a = b;
			b = c;
			printFib(i - 1);
		}
	}
}
