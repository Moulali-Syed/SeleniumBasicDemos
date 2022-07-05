package java1;

import java.util.Scanner;

public class RFactorial {
	/*
	 * 5! = 5*4*3*2*1 =120
	 */

	public static void fact() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact = fact*i;
		}
		System.out.println("factorial of "+num +" is "+ fact);
	}
	public static void main(String[] args) {
		fact();
	}
}
