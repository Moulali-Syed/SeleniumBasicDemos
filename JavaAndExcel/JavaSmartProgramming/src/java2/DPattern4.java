package java2;

/*
 			   *
 			  ***
 			 *****
 			*******


 			   *
 			  * *
 			 * * *
 			* * * *

 */
public class DPattern4 {

	public static void main(String[] args) {
		pattern7();
		System.out.println("====================================================");
		pattern8();
	}

	private static void pattern8() {

		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}

		System.out.println("=========================");

		for(int i=1;i<=4;i++) {
			for(int j=4;j>=1;j--) {
				if(j>i) {
					System.out.print(" ");
				}else {
					System.out.print(" *");
				}
			}
			System.out.println();
		}
	}

	private static void pattern7() {

		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(int j=1;j<=i-1;j++) {
				System.out.print("*");
			}
//			for(int j=1;j<=4-i;j++) {
//				System.out.print(" ");
//			}
			System.out.println();
		}
	}

}
