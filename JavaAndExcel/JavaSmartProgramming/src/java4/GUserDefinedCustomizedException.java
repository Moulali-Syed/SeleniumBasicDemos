package java4;

import java.util.Scanner;

//video 116
public class GUserDefinedCustomizedException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		try {
			if (age < 18) {
				// throw is used for printing the exception
				throw new YoungerAgeException1("not eligible to vote");
				// we cannot write any statement after throw
			} else {
				System.out.println("Eligible for vote");
			}
		} catch (YoungerAgeException1 e) {
			e.printStackTrace();
		}
		System.out.println("hello");

	}

}

class YoungerAgeException1 extends RuntimeException {
	YoungerAgeException1() {
		super("under age");
	}

	YoungerAgeException1(String msg) {
		super(msg);
	}
}
