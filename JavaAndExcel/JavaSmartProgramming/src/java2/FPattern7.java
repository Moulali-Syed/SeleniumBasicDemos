package java2;

/*
 		*
 	   *  *
 	  *    *
 	 *      *
 	*        *
 	
 	         *
   * *  [2,1]
  *  ** [[3,1][3,2]]
 *   *** [[4,1][4,2][4,3]]
*    ****[[5,1][5,2][5,3][5,4]]
 	
 	*         *
 	 *       *
 	  *     *
 	   *   *
 	     *
 	  
 	  
 	  
[[1,1][1,2][1,3][1,4][1,5]]
[[2,1][2,2][2,3][2,4]]
[[3,1][3,2][3,3]]
 *********
  *******
   *****
    ***
     *

[[1,1][1,2][1,3][1,4]]
[[2,1][2,2][2,3]]
[[3,1][3,2]]
[4,1]

i+j = n-1
 *********
  *******
   *****
    ***
     *
 */
public class FPattern7 {

	public static void main(String[] args) {
		pattern11();
		System.out.println("====================================");
		pattern12();
	}

	private static void pattern11() {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				if (j > 1) {
					System.out.print(" ");
				} else {

					System.out.print("*");
				}
			}
			for (int j = 1; j <= i - 1; j++) {

				if (j == i - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
	}

	private static void pattern12() {

		int n = 7;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= n - i; j++) {
				if (j == 1) {

					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			for (int j = 1; j <= n - i - 1; j++) {
				if (i + j == n - 1) {

					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
