package java1;

import java.util.Scanner;

public class WPrimeNumber {

	/*
	 * number divisible by 1 and itself only like 7 - divisible by 1 and 7 only
	 * 
	 * we have to check whether the number is divisible by 2 to number-1
	 */

	public static void main(String[] args) {
		checkPrime();
	}

	private static void checkPrime() {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		int temp = 0;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				temp += 1;
			}

		}
		if (temp > 0) {
			System.out.println("not prime");
		} else {
			System.out.println("prime");
		}

	}

}
