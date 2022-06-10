package ytjava2;

import java.util.Scanner;

//Scanner
public class TUserinputUsingScanner {

	public static void main(String[] args) {

		int n = 0;
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		System.out.println(n);
		//advantage - no need of handling exception
		//no need of converting string to integer
	}
}
