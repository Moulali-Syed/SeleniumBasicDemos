package java1;

import java.util.Scanner;

public class PReadUserInput {

	public static void main(String[] args) {
		//Scanner class is present in java.util package
		Scanner sc = new Scanner(System.in);

		System.out.println("enter name");

		String name = sc.next();
		System.out.println("enter gender");
		char gender = sc.next().charAt(0);
		System.out.println("enter age");
		int age = sc.nextInt();
		System.out.println("enter phone num");
		long phoneNo = sc.nextLong();

		System.out.println("Name: "+name);
		System.out.println("gender: "+gender);
		System.out.println("age: "+age);
		System.out.println("phoneNo: "+phoneNo);
	}
}
