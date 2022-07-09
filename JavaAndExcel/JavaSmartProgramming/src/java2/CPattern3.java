package java2;

/*

 		   *
 		  **
 		 ***
 		****


 		****
 		 ***
 		  **
 		   *

 		   *
 		  **
 		 ***
 		****
 	   *****
 	    ****
 		 ***
 		  **
 		   *

 */
public class CPattern3 {

	public static void main(String[] args) {
		pattern4();
		System.out.println("===================================");
		pattern5();

		System.out.println("====================================");
		pattern6();
	}

	private static void pattern6() {

		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=5-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void pattern5() {

		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i-1;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=4-i+1;j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

	private static void pattern4() {

		int n=6;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
