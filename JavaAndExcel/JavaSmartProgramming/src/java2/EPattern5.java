package java2;

/*
 		*******
 		 *****
 		  ***
 		   *
 */
public class EPattern5 {
	
	public static void main(String[] args) {
		pattern9();
	}

	private static void pattern9() {

		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i-1;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=4-i+1;j++) {
				System.out.print("*");
			}
			for(int j=1;j<=4-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
