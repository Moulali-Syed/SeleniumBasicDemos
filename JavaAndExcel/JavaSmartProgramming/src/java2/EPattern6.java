package java2;


/*
 			*
 			 *
 			  *
 			   *
 			    *
 			    *
 			   *
 			  *
 			 *
 			*
 			
 			can be derived from
 			*
 			**
 			***
 			****
 			*****
 			print spaces other than diagonal
 			
 		
 */
public class EPattern6 {
	
	public static void main(String[] args) {
		pattern10();
	}

	private static void pattern10() {

		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				if(i>j) {
					System.out.print(" ");
				}else {
					
					System.out.print("*");
				}
			}
			System.out.println();
		}
		for(int i=1;i<=4;i++) {
			for(int j=4;j>i;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				if(i>=2 && j>1) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
