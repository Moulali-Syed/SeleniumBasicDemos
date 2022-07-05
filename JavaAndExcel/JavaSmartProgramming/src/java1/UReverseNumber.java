package java1;

import java.util.Scanner;

public class UReverseNumber {

	/*
	 * num % 10 - remainder reverse = reverse*10 + remainder
	 * 
	 */
	public static void rev() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		int remainder;
		int reverse = 0;
		while (num != 0) {
			remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		}
		System.out.println("reverse of number is "+reverse);
	}

	public static void main(String[] args) {
		rev();
	}

}
