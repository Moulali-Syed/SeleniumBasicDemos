package java1;

import java.util.Scanner;

public class VReverseString {

	public static void main(String[] args) {
		revString();
	}

	public static void revString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word");
		String str = sc.next();
		int len ;

		for(len = str.length()-1;len>=0;len--) {
			System.out.print(str.charAt(len));
		}

		System.out.println();
	}
}
