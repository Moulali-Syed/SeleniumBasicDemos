package java1;

import java.util.Scanner;

public class ZPalindrome {

	/*
	 * 121 - reverse 121
	 */
	public static void main(String[] args) {
		palindrome();
	}

	private static void palindrome() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int copy = num;
		int remainder;
		int rev = 0;
		while (num > 0) {
			remainder = num % 10;
			rev = rev * 10 + remainder;
			num = num / 10;
		}

		if (rev == copy) {
			System.out.println("Palindrome");
		}else {
			System.out.println("not palindrome");
		}
	}
}
