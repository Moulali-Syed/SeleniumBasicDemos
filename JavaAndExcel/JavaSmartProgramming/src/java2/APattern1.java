package java2;

/*
 * pattern1
 		*
 		**
 		***
 		****
 		*****
 		
 	pattern2	
 		*****
 		****
 		***
 		**
 		*
 */
public class APattern1 {

	
	public static void main(String[] args) {
		
		pattern1();
		pattern2();
		
	}

	private static void pattern2() {

		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5-i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("==============================");
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void pattern1() {

		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("==============================");
	}
}
