package java2;

/*
 1
 21
 321
 4321
 54321

 */
public class JNumericPattern2 {

	public static void main(String[] args) {
		numPattern3();
	}

	private static void numPattern3() {

		for(int i=1;i<=5;i++) {
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
