package java2;

/*
 * 
 * 
 * 1
 * 26
 * 3710
 * 481113
 * 59121415
 */

public class LNumericPattern4 {

	public static void main(String[] args) {
		numPattern6();
	}

	private static void numPattern6() {

		for(int i=1;i<=5;i++) {
			int num=i;
			for(int j=1;j<=i;j++) {
				System.out.print(num+" ");
				num=num+5-j;
			}
			System.out.println();
		}
	}
}
