package java2;
/*
 
 1
 121
 12321
 1234321
 123454321
 
 54321
 5432
 543
 54
 5
 */
public class KNumericPattern3 {

	public static void main(String[] args) {
		numPattern4();
		numPattern5();
	}

	private static void numPattern5() {
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

	private static void numPattern4() {

		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			for(int k=i-1;k>=1;k--) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}
