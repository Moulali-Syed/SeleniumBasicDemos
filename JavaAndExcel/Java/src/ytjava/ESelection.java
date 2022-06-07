package ytjava;

public class ESelection {

	public static void main(String[] args) {

		// selection statements
		int n = 10;
		if (n % 2 == 0) {
			System.out.println(n + "is even");
		} else {
			System.out.println(n + " is odd");
		}

		// ternary operator
		int a = (n > 6) ? 4 : 8;

		// switch

		switch (n) {
		case 1:
			System.out.println("it is 1");
			break;
		case 2:
			System.out.println("it is 2");
			break;
		case 10:
			System.out.println("it is 10");
			break;
		default:
			System.out.println("hello");
		}
		
		//n can be integer , String[above 1.7]
	}

}
