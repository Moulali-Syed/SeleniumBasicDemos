package java1;

import java.util.Scanner;

public class SCalculatorUsingSwitch {

	public static void calci() {

		String yn;
		do {

			Scanner sc = new Scanner(System.in);
			System.out.println("enter num1 ");
			int num1 = sc.nextInt();
			System.out.println("enter num2");
			int num2 = sc.nextInt();
			System.out.println("enter a operation ");
			String op = sc.next();
			switch (op) {
			case "+":
				System.out.println(num1 + num2);
				break;
			case "-":
				System.out.println(num1 - num2);
				break;
			case "*":
				System.out.println(num1 * num2);
				break;
			case "/":
				System.out.println(num1 / num2);
				break;
			case "%":
				System.out.println(num1 % num2);
				break;
			default:
				System.out.println("enter a valid operation");
			}
			System.out.println("do u want to continue press y for yes , n for no");
			yn = sc.next();
		}while(yn.equals("y")||yn.equals("Y"));

	}

	public static void main(String[] args) {

		calci();
	}
}
