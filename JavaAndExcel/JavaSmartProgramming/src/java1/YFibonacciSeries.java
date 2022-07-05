package java1;

public class YFibonacciSeries {

	/*
	 * 0 1 1 2 3 5 8 13 .....
	 */

	public static void main(String[] args) {
		fibonacci();
	}

	private static void fibonacci() {

		int a = 0, b = 1;
		int c;
		System.out.print(a+" "+b+" ");
		for (int i = 1; i <= 10; i++) {
			c = a + b;
			System.out.print(c+" ");
			a = b;
			b = c;
		}
	}
}
