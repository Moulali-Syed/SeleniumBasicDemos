package ytjava;

public class GNestedLoops {
	public static void main(String[] args) {

		System.out.println("****SQUARE Pattern******");
		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= 4; j++) {
				System.out.print("*" + " ");

			}
			System.out.println();
		}

		System.out.println("**************Triangle of Numbers**********");
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		System.out.println("*************triangle of letters ***********");
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char) (64 + j) +" ");
			}
			System.out.println();
		}
		
		System.out.println("Empty square");
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				
			}
		}
		
		/*
		 * 
		 * $$$$
		 * $  $
		 * $$$$
		 */

	}
}
